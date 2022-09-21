package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInputParameter extends StObject {
  
  /**
    * The data type of the Parameter
    */
  var dataType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The following field specifies the default value of the Parameter provided by the external system if a value is not provided.
    */
  var defaultValue: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * A brief description of the Parameter.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the Parameter.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies whether a null value is allowed.
    */
  var nullable: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaInputParameter {
  
  inline def apply(): SchemaInputParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInputParameter]
  }
  
  extension [Self <: SchemaInputParameter](x: Self) {
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeNull: Self = StObject.set(x, "dataType", null)
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableNull: Self = StObject.set(x, "nullable", null)
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
  }
}
