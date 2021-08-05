package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates a conditional format rule at the given index, or moves a
  * conditional format rule to another index.
  */
trait SchemaUpdateConditionalFormatRuleRequest extends StObject {
  
  /**
    * The zero-based index of the rule that should be replaced or moved.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * The zero-based new index the rule should end up at.
    */
  var newIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The rule that should replace the rule at the given index.
    */
  var rule: js.UndefOr[SchemaConditionalFormatRule] = js.undefined
  
  /**
    * The sheet of the rule to move.  Required if new_index is set, unused
    * otherwise.
    */
  var sheetId: js.UndefOr[Double] = js.undefined
}
object SchemaUpdateConditionalFormatRuleRequest {
  
  inline def apply(): SchemaUpdateConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateConditionalFormatRuleRequest]
  }
  
  extension [Self <: SchemaUpdateConditionalFormatRuleRequest](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    inline def setNewIndexUndefined: Self = StObject.set(x, "newIndex", js.undefined)
    
    inline def setRule(value: SchemaConditionalFormatRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
