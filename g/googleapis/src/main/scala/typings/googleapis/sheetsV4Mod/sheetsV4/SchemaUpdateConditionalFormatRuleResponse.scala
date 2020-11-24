package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of updating a conditional format rule.
  */
@js.native
trait SchemaUpdateConditionalFormatRuleResponse extends js.Object {
  
  /**
    * The index of the new rule.
    */
  var newIndex: js.UndefOr[Double] = js.native
  
  /**
    * The new rule that replaced the old rule (if replacing), or the rule that
    * was moved (if moved)
    */
  var newRule: js.UndefOr[SchemaConditionalFormatRule] = js.native
  
  /**
    * The old index of the rule. Not set if a rule was replaced (because it is
    * the same as new_index).
    */
  var oldIndex: js.UndefOr[Double] = js.native
  
  /**
    * The old (deleted) rule. Not set if a rule was moved (because it is the
    * same as new_rule).
    */
  var oldRule: js.UndefOr[SchemaConditionalFormatRule] = js.native
}
object SchemaUpdateConditionalFormatRuleResponse {
  
  @scala.inline
  def apply(): SchemaUpdateConditionalFormatRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateConditionalFormatRuleResponse]
  }
  
  @scala.inline
  implicit class SchemaUpdateConditionalFormatRuleResponseOps[Self <: SchemaUpdateConditionalFormatRuleResponse] (val x: Self) extends AnyVal {
    
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
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewIndex: Self = this.set("newIndex", js.undefined)
    
    @scala.inline
    def setNewRule(value: SchemaConditionalFormatRule): Self = this.set("newRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewRule: Self = this.set("newRule", js.undefined)
    
    @scala.inline
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldIndex: Self = this.set("oldIndex", js.undefined)
    
    @scala.inline
    def setOldRule(value: SchemaConditionalFormatRule): Self = this.set("oldRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldRule: Self = this.set("oldRule", js.undefined)
  }
}
