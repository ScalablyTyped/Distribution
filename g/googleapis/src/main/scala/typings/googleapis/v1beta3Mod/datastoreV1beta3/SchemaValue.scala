package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message that can hold any of the supported value types and associated
  * metadata.
  */
@js.native
trait SchemaValue extends js.Object {
  
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
  implicit class SchemaValueOps[Self <: SchemaValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrayValue(value: SchemaArrayValue): Self = this.set("arrayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayValue: Self = this.set("arrayValue", js.undefined)
    
    @scala.inline
    def setBlobValue(value: String): Self = this.set("blobValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlobValue: Self = this.set("blobValue", js.undefined)
    
    @scala.inline
    def setBooleanValue(value: Boolean): Self = this.set("booleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooleanValue: Self = this.set("booleanValue", js.undefined)
    
    @scala.inline
    def setDoubleValue(value: Double): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    
    @scala.inline
    def setEntityValue(value: SchemaEntity): Self = this.set("entityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityValue: Self = this.set("entityValue", js.undefined)
    
    @scala.inline
    def setExcludeFromIndexes(value: Boolean): Self = this.set("excludeFromIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeFromIndexes: Self = this.set("excludeFromIndexes", js.undefined)
    
    @scala.inline
    def setGeoPointValue(value: SchemaLatLng): Self = this.set("geoPointValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoPointValue: Self = this.set("geoPointValue", js.undefined)
    
    @scala.inline
    def setIntegerValue(value: String): Self = this.set("integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerValue: Self = this.set("integerValue", js.undefined)
    
    @scala.inline
    def setKeyValue(value: SchemaKey): Self = this.set("keyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyValue: Self = this.set("keyValue", js.undefined)
    
    @scala.inline
    def setMeaning(value: Double): Self = this.set("meaning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeaning: Self = this.set("meaning", js.undefined)
    
    @scala.inline
    def setNullValue(value: String): Self = this.set("nullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullValue: Self = this.set("nullValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
    
    @scala.inline
    def setTimestampValue(value: String): Self = this.set("timestampValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampValue: Self = this.set("timestampValue", js.undefined)
  }
}
