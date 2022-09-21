package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataValidationRule extends StObject {
  
  /**
    * The condition that data in the cell must match.
    */
  var condition: js.UndefOr[SchemaBooleanCondition] = js.undefined
  
  /**
    * A message to show the user when adding data to the cell.
    */
  var inputMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if the UI should be customized based on the kind of condition. If true, "List" conditions will show a dropdown.
    */
  var showCustomUi: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * True if invalid data should be rejected.
    */
  var strict: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDataValidationRule {
  
  inline def apply(): SchemaDataValidationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataValidationRule]
  }
  
  extension [Self <: SchemaDataValidationRule](x: Self) {
    
    inline def setCondition(value: SchemaBooleanCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setInputMessage(value: String): Self = StObject.set(x, "inputMessage", value.asInstanceOf[js.Any])
    
    inline def setInputMessageNull: Self = StObject.set(x, "inputMessage", null)
    
    inline def setInputMessageUndefined: Self = StObject.set(x, "inputMessage", js.undefined)
    
    inline def setShowCustomUi(value: Boolean): Self = StObject.set(x, "showCustomUi", value.asInstanceOf[js.Any])
    
    inline def setShowCustomUiNull: Self = StObject.set(x, "showCustomUi", null)
    
    inline def setShowCustomUiUndefined: Self = StObject.set(x, "showCustomUi", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictNull: Self = StObject.set(x, "strict", null)
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
