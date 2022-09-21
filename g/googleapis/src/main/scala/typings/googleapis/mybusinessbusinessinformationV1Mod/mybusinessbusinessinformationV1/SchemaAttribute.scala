package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttribute extends StObject {
  
  /**
    * Required. The resource name for this attribute.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When the attribute value type is REPEATED_ENUM, this contains the attribute value, and the other values fields must be empty.
    */
  var repeatedEnumValue: js.UndefOr[SchemaRepeatedEnumAttributeValue] = js.undefined
  
  /**
    * When the attribute value type is URL, this field contains the value(s) for this attribute, and the other values fields must be empty.
    */
  var uriValues: js.UndefOr[js.Array[SchemaUriAttributeValue]] = js.undefined
  
  /**
    * Output only. The type of value that this attribute contains. This should be used to determine how to interpret the value.
    */
  var valueType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The values for this attribute. The type of the values supplied must match that expected for that attribute. This is a repeated field where multiple attribute values may be provided. Attribute types only support one value.
    */
  var values: js.UndefOr[js.Array[Any] | Null] = js.undefined
}
object SchemaAttribute {
  
  inline def apply(): SchemaAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttribute]
  }
  
  extension [Self <: SchemaAttribute](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRepeatedEnumValue(value: SchemaRepeatedEnumAttributeValue): Self = StObject.set(x, "repeatedEnumValue", value.asInstanceOf[js.Any])
    
    inline def setRepeatedEnumValueUndefined: Self = StObject.set(x, "repeatedEnumValue", js.undefined)
    
    inline def setUriValues(value: js.Array[SchemaUriAttributeValue]): Self = StObject.set(x, "uriValues", value.asInstanceOf[js.Any])
    
    inline def setUriValuesUndefined: Self = StObject.set(x, "uriValues", js.undefined)
    
    inline def setUriValuesVarargs(value: SchemaUriAttributeValue*): Self = StObject.set(x, "uriValues", js.Array(value*))
    
    inline def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeNull: Self = StObject.set(x, "valueType", null)
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
