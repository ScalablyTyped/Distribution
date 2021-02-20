package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of deleting a conditional format rule.
  */
@js.native
trait SchemaDeleteConditionalFormatRuleResponse extends StObject {
  
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
  implicit class SchemaDeleteConditionalFormatRuleResponseMutableBuilder[Self <: SchemaDeleteConditionalFormatRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: SchemaConditionalFormatRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
