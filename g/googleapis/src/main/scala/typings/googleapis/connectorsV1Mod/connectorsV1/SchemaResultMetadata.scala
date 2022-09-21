package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResultMetadata extends StObject {
  
  /**
    * The data type of the field.
    */
  var dataType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A brief description of the field.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the result field.
    */
  var field: js.UndefOr[String | Null] = js.undefined
}
object SchemaResultMetadata {
  
  inline def apply(): SchemaResultMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultMetadata]
  }
  
  extension [Self <: SchemaResultMetadata](x: Self) {
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeNull: Self = StObject.set(x, "dataType", null)
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldNull: Self = StObject.set(x, "field", null)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
