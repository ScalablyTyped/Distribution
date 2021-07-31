package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message that can hold any of the supported value types.
  */
trait SchemaValue extends StObject {
  
  /**
    * An array value.  Cannot directly contain another array value, though can
    * contain an map which contains another array.
    */
  var arrayValue: js.UndefOr[SchemaArrayValue] = js.undefined
  
  /**
    * A boolean value.
    */
  var booleanValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A bytes value.  Must not exceed 1 MiB - 89 bytes. Only the first 1,500
    * bytes are considered by queries.
    */
  var bytesValue: js.UndefOr[String] = js.undefined
  
  /**
    * A double value.
    */
  var doubleValue: js.UndefOr[Double] = js.undefined
  
  /**
    * A geo point value representing a point on the surface of Earth.
    */
  var geoPointValue: js.UndefOr[SchemaLatLng] = js.undefined
  
  /**
    * An integer value.
    */
  var integerValue: js.UndefOr[String] = js.undefined
  
  /**
    * A map value.
    */
  var mapValue: js.UndefOr[SchemaMapValue] = js.undefined
  
  /**
    * A null value.
    */
  var nullValue: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to a document. For example:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var referenceValue: js.UndefOr[String] = js.undefined
  
  /**
    * A string value.  The string, represented as UTF-8, must not exceed 1 MiB
    * - 89 bytes. Only the first 1,500 bytes of the UTF-8 representation are
    * considered by queries.
    */
  var stringValue: js.UndefOr[String] = js.undefined
  
  /**
    * A timestamp value.  Precise only to microseconds. When stored, any
    * additional precision is rounded down.
    */
  var timestampValue: js.UndefOr[String] = js.undefined
}
object SchemaValue {
  
  @scala.inline
  def apply(): SchemaValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValue]
  }
  
  @scala.inline
  implicit class SchemaValueMutableBuilder[Self <: SchemaValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayValue(value: SchemaArrayValue): Self = StObject.set(x, "arrayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayValueUndefined: Self = StObject.set(x, "arrayValue", js.undefined)
    
    @scala.inline
    def setBooleanValue(value: Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    @scala.inline
    def setBytesValue(value: String): Self = StObject.set(x, "bytesValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesValueUndefined: Self = StObject.set(x, "bytesValue", js.undefined)
    
    @scala.inline
    def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    @scala.inline
    def setGeoPointValue(value: SchemaLatLng): Self = StObject.set(x, "geoPointValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoPointValueUndefined: Self = StObject.set(x, "geoPointValue", js.undefined)
    
    @scala.inline
    def setIntegerValue(value: String): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    @scala.inline
    def setMapValue(value: SchemaMapValue): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapValueUndefined: Self = StObject.set(x, "mapValue", js.undefined)
    
    @scala.inline
    def setNullValue(value: String): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    @scala.inline
    def setReferenceValue(value: String): Self = StObject.set(x, "referenceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceValueUndefined: Self = StObject.set(x, "referenceValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    @scala.inline
    def setTimestampValue(value: String): Self = StObject.set(x, "timestampValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampValueUndefined: Self = StObject.set(x, "timestampValue", js.undefined)
  }
}
