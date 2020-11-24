package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of deleting a conditional format rule.
  */
@js.native
trait SchemaDeleteConditionalFormatRuleResponse extends js.Object {
  
  /**
    * The rule that was deleted.
    */
  var rule: js.UndefOr[SchemaConditionalFormatRule] = js.native
}
object SchemaDeleteConditionalFormatRuleResponse {
  
  @scala.inline
  def apply(): SchemaDeleteConditionalFormatRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteConditionalFormatRuleResponse]
  }
  
  @scala.inline
  implicit class SchemaDeleteConditionalFormatRuleResponseOps[Self <: SchemaDeleteConditionalFormatRuleResponse] (val x: Self) extends AnyVal {
    
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
    def setRule(value: SchemaConditionalFormatRule): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
  }
}
