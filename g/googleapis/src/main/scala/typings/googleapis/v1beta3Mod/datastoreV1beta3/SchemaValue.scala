package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message that can hold any of the supported value types and associated
  * metadata.
  */
@js.native
trait SchemaValue extends StObject {
  
  /**
    * An array value. Cannot contain another array value. A `Value` instance
    * that sets field `array_value` must not set fields `meaning` or
    * `exclude_from_indexes`.
    */
  var arrayValue: js.UndefOr[SchemaArrayValue] = js.native
  
  /**
    * A blob value. May have at most 1,000,000 bytes. When
    * `exclude_from_indexes` is false, may have at most 1500 bytes. In JSON
    * requests, must be base64-encoded.
    */
  var blobValue: js.UndefOr[String] = js.native
  
  /**
    * A boolean value.
    */
  var booleanValue: js.UndefOr[Boolean] = js.native
  
  /**
    * A double value.
    */
  var doubleValue: js.UndefOr[Double] = js.native
  
  /**
    * An entity value.  - May have no key. - May have a key with an incomplete
    * key path. - May have a reserved/read-only key.
    */
  var entityValue: js.UndefOr[SchemaEntity] = js.native
  
  /**
    * If the value should be excluded from all indexes including those defined
    * explicitly.
    */
  var excludeFromIndexes: js.UndefOr[Boolean] = js.native
  
  /**
    * A geo point value representing a point on the surface of Earth.
    */
  var geoPointValue: js.UndefOr[SchemaLatLng] = js.native
  
  /**
    * An integer value.
    */
  var integerValue: js.UndefOr[String] = js.native
  
  /**
    * A key value.
    */
  var keyValue: js.UndefOr[SchemaKey] = js.native
  
  /**
    * The `meaning` field should only be populated for backwards compatibility.
    */
  var meaning: js.UndefOr[Double] = js.native
  
  /**
    * A null value.
    */
  var nullValue: js.UndefOr[String] = js.native
  
  /**
    * A UTF-8 encoded string value. When `exclude_from_indexes` is false (it is
    * indexed) , may have at most 1500 bytes. Otherwise, may be set to at least
    * 1,000,000 bytes.
    */
  var stringValue: js.UndefOr[String] = js.native
  
  /**
    * A timestamp value. When stored in the Datastore, precise only to
    * microseconds; any additional precision is rounded down.
    */
  var timestampValue: js.UndefOr[String] = js.native
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
    def setBlobValue(value: String): Self = StObject.set(x, "blobValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobValueUndefined: Self = StObject.set(x, "blobValue", js.undefined)
    
    @scala.inline
    def setBooleanValue(value: Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    @scala.inline
    def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    @scala.inline
    def setEntityValue(value: SchemaEntity): Self = StObject.set(x, "entityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityValueUndefined: Self = StObject.set(x, "entityValue", js.undefined)
    
    @scala.inline
    def setExcludeFromIndexes(value: Boolean): Self = StObject.set(x, "excludeFromIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeFromIndexesUndefined: Self = StObject.set(x, "excludeFromIndexes", js.undefined)
    
    @scala.inline
    def setGeoPointValue(value: SchemaLatLng): Self = StObject.set(x, "geoPointValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoPointValueUndefined: Self = StObject.set(x, "geoPointValue", js.undefined)
    
    @scala.inline
    def setIntegerValue(value: String): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    @scala.inline
    def setKeyValue(value: SchemaKey): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
    
    @scala.inline
    def setMeaning(value: Double): Self = StObject.set(x, "meaning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeaningUndefined: Self = StObject.set(x, "meaning", js.undefined)
    
    @scala.inline
    def setNullValue(value: String): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
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
