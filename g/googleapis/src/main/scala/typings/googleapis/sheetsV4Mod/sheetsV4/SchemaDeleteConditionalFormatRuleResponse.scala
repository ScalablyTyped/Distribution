package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteConditionalFormatRuleResponse extends StObject {
  
  /**
    * The rule that was deleted.
    */
  var rule: js.UndefOr[SchemaConditionalFormatRule] = js.undefined
}
object SchemaDeleteConditionalFormatRuleResponse {
  
  inline def apply(): SchemaDeleteConditionalFormatRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteConditionalFormatRuleResponse]
  }
  
  extension [Self <: SchemaDeleteConditionalFormatRuleResponse](x: Self) {
    
    inline def setRule(value: SchemaConditionalFormatRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
