package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates properties of a spreadsheet.
  */
@js.native
trait SchemaUpdateSpreadsheetPropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root &#39;properties&#39; is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The properties to update.
    */
  var properties: js.UndefOr[SchemaSpreadsheetProperties] = js.native
}

object SchemaUpdateSpreadsheetPropertiesRequest {
  @scala.inline
  def apply(fields: String = null, properties: SchemaSpreadsheetProperties = null): SchemaUpdateSpreadsheetPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateSpreadsheetPropertiesRequest]
  }
}

