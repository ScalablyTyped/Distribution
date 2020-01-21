package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata of a matched search result.
  */
@js.native
trait SchemaMetadata extends js.Object {
  /**
    * The creation time for this document or object in the search result.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Options that specify how to display a structured data search result.
    */
  var displayOptions: js.UndefOr[SchemaResultDisplayMetadata] = js.native
  /**
    * Indexed fields in structured data, returned as a generic named property.
    */
  var fields: js.UndefOr[js.Array[SchemaNamedProperty]] = js.native
  /**
    * Mime type of the search result.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Object type of the search result.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * Owner (usually creator) of the document or object of the search result.
    */
  var owner: js.UndefOr[SchemaPerson] = js.native
  /**
    * The named source for the result, such as Gmail.
    */
  var source: js.UndefOr[SchemaSource] = js.native
  /**
    * The last modified date for the object in the search result. If not set in
    * the item, the value returned here is empty. When `updateTime` is used for
    * calculating freshness and is not set, this value defaults to 2 years from
    * the current time.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaMetadata {
  @scala.inline
  def apply(
    createTime: String = null,
    displayOptions: SchemaResultDisplayMetadata = null,
    fields: js.Array[SchemaNamedProperty] = null,
    mimeType: String = null,
    objectType: String = null,
    owner: SchemaPerson = null,
    source: SchemaSource = null,
    updateTime: String = null
  ): SchemaMetadata = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetadata]
  }
}

