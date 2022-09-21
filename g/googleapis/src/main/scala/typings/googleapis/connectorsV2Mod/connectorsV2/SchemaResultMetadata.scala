package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResultMetadata extends StObject {
  
  /**
    * The data type of the metadata field
    */
  var dataType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A brief description of the metadata field.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the metadata field.
    */
  var name: js.UndefOr[String | Null] = js.undefined
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
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
