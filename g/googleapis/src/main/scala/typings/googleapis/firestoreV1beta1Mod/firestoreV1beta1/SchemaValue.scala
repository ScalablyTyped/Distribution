package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValue extends StObject {
  
  /**
    * An array value. Cannot directly contain another array value, though can contain an map which contains another array.
    */
  var arrayValue: js.UndefOr[SchemaArrayValue] = js.undefined
  
  /**
    * A boolean value.
    */
  var booleanValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A bytes value. Must not exceed 1 MiB - 89 bytes. Only the first 1,500 bytes are considered by queries.
    */
  var bytesValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A double value.
    */
  var doubleValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A geo point value representing a point on the surface of Earth.
    */
  var geoPointValue: js.UndefOr[SchemaLatLng] = js.undefined
  
  /**
    * An integer value.
    */
  var integerValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A map value.
    */
  var mapValue: js.UndefOr[SchemaMapValue] = js.undefined
  
  /**
    * A null value.
    */
  var nullValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A reference to a document. For example: `projects/{project_id\}/databases/{database_id\}/documents/{document_path\}`.
    */
  var referenceValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A string value. The string, represented as UTF-8, must not exceed 1 MiB - 89 bytes. Only the first 1,500 bytes of the UTF-8 representation are considered by queries.
    */
  var stringValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A timestamp value. Precise only to microseconds. When stored, any additional precision is rounded down.
    */
  var timestampValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaValue {
  
  inline def apply(): SchemaValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValue]
  }
  
  extension [Self <: SchemaValue](x: Self) {
    
    inline def setArrayValue(value: SchemaArrayValue): Self = StObject.set(x, "arrayValue", value.asInstanceOf[js.Any])
    
    inline def setArrayValueUndefined: Self = StObject.set(x, "arrayValue", js.undefined)
    
    inline def setBooleanValue(value: Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    inline def setBooleanValueNull: Self = StObject.set(x, "booleanValue", null)
    
    inline def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    inline def setBytesValue(value: String): Self = StObject.set(x, "bytesValue", value.asInstanceOf[js.Any])
    
    inline def setBytesValueNull: Self = StObject.set(x, "bytesValue", null)
    
    inline def setBytesValueUndefined: Self = StObject.set(x, "bytesValue", js.undefined)
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueNull: Self = StObject.set(x, "doubleValue", null)
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setGeoPointValue(value: SchemaLatLng): Self = StObject.set(x, "geoPointValue", value.asInstanceOf[js.Any])
    
    inline def setGeoPointValueUndefined: Self = StObject.set(x, "geoPointValue", js.undefined)
    
    inline def setIntegerValue(value: String): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    inline def setIntegerValueNull: Self = StObject.set(x, "integerValue", null)
    
    inline def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    inline def setMapValue(value: SchemaMapValue): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
    
    inline def setMapValueUndefined: Self = StObject.set(x, "mapValue", js.undefined)
    
    inline def setNullValue(value: String): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    inline def setNullValueNull: Self = StObject.set(x, "nullValue", null)
    
    inline def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    inline def setReferenceValue(value: String): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
    
    inline def setReferenceValueNull: Self = StObject.set(x, "referenceValue", null)
    
    inline def setReferenceValueUndefined: Self = StObject.set(x, "referenceValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    inline def setTimestampValue(value: String): Self = StObject.set(x, "timestampValue", value.asInstanceOf[js.Any])
    
    inline def setTimestampValueNull: Self = StObject.set(x, "timestampValue", null)
    
    inline def setTimestampValueUndefined: Self = StObject.set(x, "timestampValue", js.undefined)
  }
}
