package typings.ldclientJsCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LDEvaluationReason extends js.Object {
  
  /**
    * A further description of the error condition, if the kind was `'ERROR'`.
    */
  var errorKind: js.UndefOr[String] = js.native
  
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
  var kind: String = js.native
  
  /**
    * The key of the failed prerequisite flag, if the kind was `'PREREQUISITE_FAILED'`.
    */
  var prerequisiteKey: js.UndefOr[String] = js.native
  
  /**
    * The unique identifier of the matched rule, if the kind was `'RULE_MATCH'`.
    */
  var ruleId: js.UndefOr[String] = js.native
  
  /**
    * The index of the matched rule (0 for the first), if the kind was `'RULE_MATCH'`.
    */
  var ruleIndex: js.UndefOr[Double] = js.native
}
object LDEvaluationReason {
  
  @scala.inline
  def apply(kind: String): LDEvaluationReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDEvaluationReason]
  }
  
  @scala.inline
  implicit class LDEvaluationReasonOps[Self <: LDEvaluationReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorKind(value: String): Self = this.set("errorKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorKind: Self = this.set("errorKind", js.undefined)
    
    @scala.inline
    def setPrerequisiteKey(value: String): Self = this.set("prerequisiteKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrerequisiteKey: Self = this.set("prerequisiteKey", js.undefined)
    
    @scala.inline
    def setRuleId(value: String): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleId: Self = this.set("ruleId", js.undefined)
    
    @scala.inline
    def setRuleIndex(value: Double): Self = this.set("ruleIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleIndex: Self = this.set("ruleIndex", js.undefined)
  }
}
