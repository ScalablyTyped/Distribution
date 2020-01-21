package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of duplicating a sheet.
  */
@js.native
trait SchemaDuplicateSheetResponse extends js.Object {
  /**
    * The properties of the duplicate sheet.
    */
  var properties: js.UndefOr[SchemaSheetProperties] = js.native
}

object SchemaDuplicateSheetResponse {
  @scala.inline
  def apply(properties: SchemaSheetProperties = null): SchemaDuplicateSheetResponse = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDuplicateSheetResponse]
  }
}

