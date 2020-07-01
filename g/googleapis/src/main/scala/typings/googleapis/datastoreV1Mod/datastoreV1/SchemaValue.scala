package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    arrayValue: SchemaArrayValue = null,
    blobValue: String = null,
    booleanValue: js.UndefOr[Boolean] = js.undefined,
    doubleValue: js.UndefOr[Double] = js.undefined,
    entityValue: SchemaEntity = null,
    excludeFromIndexes: js.UndefOr[Boolean] = js.undefined,
    geoPointValue: SchemaLatLng = null,
    integerValue: String = null,
    keyValue: SchemaKey = null,
    meaning: js.UndefOr[Double] = js.undefined,
    nullValue: String = null,
    stringValue: String = null,
    timestampValue: String = null
  ): SchemaValue = {
    val __obj = js.Dynamic.literal()
    if (arrayValue != null) __obj.updateDynamic("arrayValue")(arrayValue.asInstanceOf[js.Any])
    if (blobValue != null) __obj.updateDynamic("blobValue")(blobValue.asInstanceOf[js.Any])
    if (!js.isUndefined(booleanValue)) __obj.updateDynamic("booleanValue")(booleanValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleValue)) __obj.updateDynamic("doubleValue")(doubleValue.get.asInstanceOf[js.Any])
    if (entityValue != null) __obj.updateDynamic("entityValue")(entityValue.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeFromIndexes)) __obj.updateDynamic("excludeFromIndexes")(excludeFromIndexes.get.asInstanceOf[js.Any])
    if (geoPointValue != null) __obj.updateDynamic("geoPointValue")(geoPointValue.asInstanceOf[js.Any])
    if (integerValue != null) __obj.updateDynamic("integerValue")(integerValue.asInstanceOf[js.Any])
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue.asInstanceOf[js.Any])
    if (!js.isUndefined(meaning)) __obj.updateDynamic("meaning")(meaning.get.asInstanceOf[js.Any])
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    if (timestampValue != null) __obj.updateDynamic("timestampValue")(timestampValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaValue]
  }
}

