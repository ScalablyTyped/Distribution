package typings
package ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDEvaluationReason extends js.Object {
  /**
    * A further description of the error condition, if the kind was 'ERROR'.
    */
  var errorKind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The general category of the reason:
    *
    * 'OFF': the flag was off and therefore returned its configured off value
    *
    * 'FALLTHROUGH': the flag was on but the user did not match any targets or rules
    *
    * 'TARGET_MATCH': the user key was specifically targeted for this flag
    *
    * 'RULE_MATCH': the user matched one of the flag's rules
    *
    * 'PREREQUISITE_FAILED': the flag was considered off because it had at least one
    * prerequisite flag that either was off or did not return the desired variation
    *
    * 'ERROR': the flag could not be evaluated, e.g. because it does not exist or due
    * to an unexpected error
    */
  var kind: java.lang.String
  /**
    * The key of the failed prerequisite flag, if the kind was 'PREREQUISITE_FAILED'.
    */
  var prerequisiteKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The unique identifier of the matched rule, if the kind was 'RULE_MATCH'.
    */
  var ruleId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index of the matched rule (0 for the first), if the kind was 'RULE_MATCH'.
    */
  var ruleIndex: js.UndefOr[scala.Double] = js.undefined
}

