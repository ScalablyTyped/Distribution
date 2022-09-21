package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLabelField extends StObject {
  
  /**
    * Only present if valueType is dateString. RFC 3339 formatted date: YYYY-MM-DD.
    */
  var dateString: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The identifier of this field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only present if valueType is integer.
    */
  var integer: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * This is always drive#labelField.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only present if valueType is selection.
    */
  var selection: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Only present if valueType is text.
    */
  var text: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Only present if valueType is user.
    */
  var user: js.UndefOr[js.Array[SchemaUser]] = js.undefined
  
  /**
    * The field type. While new values may be supported in the future, the following are currently allowed:
    * - dateString
    * - integer
    * - selection
    * - text
    * - user
    */
  var valueType: js.UndefOr[String | Null] = js.undefined
}
object SchemaLabelField {
  
  inline def apply(): SchemaLabelField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLabelField]
  }
  
  extension [Self <: SchemaLabelField](x: Self) {
    
    inline def setDateString(value: js.Array[String]): Self = StObject.set(x, "dateString", value.asInstanceOf[js.Any])
    
    inline def setDateStringNull: Self = StObject.set(x, "dateString", null)
    
    inline def setDateStringUndefined: Self = StObject.set(x, "dateString", js.undefined)
    
    inline def setDateStringVarargs(value: String*): Self = StObject.set(x, "dateString", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInteger(value: js.Array[String]): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    inline def setIntegerNull: Self = StObject.set(x, "integer", null)
    
    inline def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
    
    inline def setIntegerVarargs(value: String*): Self = StObject.set(x, "integer", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSelection(value: js.Array[String]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionNull: Self = StObject.set(x, "selection", null)
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setSelectionVarargs(value: String*): Self = StObject.set(x, "selection", js.Array(value*))
    
    inline def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setUser(value: js.Array[SchemaUser]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setUserVarargs(value: SchemaUser*): Self = StObject.set(x, "user", js.Array(value*))
    
    inline def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeNull: Self = StObject.set(x, "valueType", null)
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
