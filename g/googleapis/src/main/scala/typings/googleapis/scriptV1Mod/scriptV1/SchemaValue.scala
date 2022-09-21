package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValue extends StObject {
  
  /**
    * Represents a boolean value.
    */
  var boolValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Represents raw byte values.
    */
  var bytesValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Represents a date in ms since the epoch.
    */
  var dateValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Represents a repeated `Value`.
    */
  var listValue: js.UndefOr[SchemaListValue] = js.undefined
  
  /**
    * Represents a null value.
    */
  var nullValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Represents a double value.
    */
  var numberValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Represents a structured proto value.
    */
  var protoValue: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Represents a string value.
    */
  var stringValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Represents a structured value.
    */
  var structValue: js.UndefOr[SchemaStruct] = js.undefined
}
object SchemaValue {
  
  inline def apply(): SchemaValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValue]
  }
  
  extension [Self <: SchemaValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueNull: Self = StObject.set(x, "boolValue", null)
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setBytesValue(value: String): Self = StObject.set(x, "bytesValue", value.asInstanceOf[js.Any])
    
    inline def setBytesValueNull: Self = StObject.set(x, "bytesValue", null)
    
    inline def setBytesValueUndefined: Self = StObject.set(x, "bytesValue", js.undefined)
    
    inline def setDateValue(value: String): Self = StObject.set(x, "dateValue", value.asInstanceOf[js.Any])
    
    inline def setDateValueNull: Self = StObject.set(x, "dateValue", null)
    
    inline def setDateValueUndefined: Self = StObject.set(x, "dateValue", js.undefined)
    
    inline def setListValue(value: SchemaListValue): Self = StObject.set(x, "listValue", value.asInstanceOf[js.Any])
    
    inline def setListValueUndefined: Self = StObject.set(x, "listValue", js.undefined)
    
    inline def setNullValue(value: String): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    inline def setNullValueNull: Self = StObject.set(x, "nullValue", null)
    
    inline def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    inline def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
    
    inline def setNumberValueNull: Self = StObject.set(x, "numberValue", null)
    
    inline def setNumberValueUndefined: Self = StObject.set(x, "numberValue", js.undefined)
    
    inline def setProtoValue(value: StringDictionary[Any]): Self = StObject.set(x, "protoValue", value.asInstanceOf[js.Any])
    
    inline def setProtoValueNull: Self = StObject.set(x, "protoValue", null)
    
    inline def setProtoValueUndefined: Self = StObject.set(x, "protoValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    inline def setStructValue(value: SchemaStruct): Self = StObject.set(x, "structValue", value.asInstanceOf[js.Any])
    
    inline def setStructValueUndefined: Self = StObject.set(x, "structValue", js.undefined)
  }
}
