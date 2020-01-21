package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates properties of dimensions within the specified range.
  */
@js.native
trait SchemaUpdateDimensionPropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `properties` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * Properties to update.
    */
  var properties: js.UndefOr[SchemaDimensionProperties] = js.native
  /**
    * The rows or columns to update.
    */
  var range: js.UndefOr[SchemaDimensionRange] = js.native
}

object SchemaUpdateDimensionPropertiesRequest {
  @scala.inline
  def apply(
    fields: String = null,
    properties: SchemaDimensionProperties = null,
    range: SchemaDimensionRange = null
  ): SchemaUpdateDimensionPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateDimensionPropertiesRequest]
  }
}

