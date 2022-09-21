package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteConditionalFormatRuleRequest extends StObject {
  
  /**
    * The zero-based index of the rule to be deleted.
    */
  var index: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The sheet the rule is being deleted from.
    */
  var sheetId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDeleteConditionalFormatRuleRequest {
  
  inline def apply(): SchemaDeleteConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteConditionalFormatRuleRequest]
  }
  
  extension [Self <: SchemaDeleteConditionalFormatRuleRequest](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdNull: Self = StObject.set(x, "sheetId", null)
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
