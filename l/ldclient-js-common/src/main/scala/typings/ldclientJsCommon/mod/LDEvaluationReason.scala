package typings.ldclientJsCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDEvaluationReason extends js.Object {
  /**
    * A further description of the error condition, if the kind was `'ERROR'`.
    */
  var errorKind: js.UndefOr[String] = js.undefined
  /**
    * The general category of the reason:
    *
    * - `'OFF'`: The flag was off and therefore returned its configured off value.
    * - `'FALLTHROUGH'`: The flag was on but the user did not match any targets or rules.
    * - `'TARGET_MATCH'`: The user key was specifically targeted for this flag.
    * - `'RULE_MATCH'`: the user matched one of the flag's rules.
    * - `'PREREQUISITE_FAILED'`: The flag was considered off because it had at least one
    *   prerequisite flag that either was off or did not return the desired variation.
    * - `'ERROR'`: The flag could not be evaluated, e.g. because it does not exist or due
    *   to an unexpected error.
    */
  var kind: String
  /**
    * The key of the failed prerequisite flag, if the kind was `'PREREQUISITE_FAILED'`.
    */
  var prerequisiteKey: js.UndefOr[String] = js.undefined
  /**
    * The unique identifier of the matched rule, if the kind was `'RULE_MATCH'`.
    */
  var ruleId: js.UndefOr[String] = js.undefined
  /**
    * The index of the matched rule (0 for the first), if the kind was `'RULE_MATCH'`.
    */
  var ruleIndex: js.UndefOr[Double] = js.undefined
}

object LDEvaluationReason {
  @scala.inline
  def apply(
    kind: String,
    errorKind: String = null,
    prerequisiteKey: String = null,
    ruleId: String = null,
    ruleIndex: js.UndefOr[Double] = js.undefined
  ): LDEvaluationReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (errorKind != null) __obj.updateDynamic("errorKind")(errorKind.asInstanceOf[js.Any])
    if (prerequisiteKey != null) __obj.updateDynamic("prerequisiteKey")(prerequisiteKey.asInstanceOf[js.Any])
    if (ruleId != null) __obj.updateDynamic("ruleId")(ruleId.asInstanceOf[js.Any])
    if (!js.isUndefined(ruleIndex)) __obj.updateDynamic("ruleIndex")(ruleIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDEvaluationReason]
  }
}

