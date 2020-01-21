package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a sheet.
  */
@js.native
trait SchemaAddSheetResponse extends js.Object {
  /**
    * The properties of the newly added sheet.
    */
  var properties: js.UndefOr[SchemaSheetProperties] = js.native
}

object SchemaAddSheetResponse {
  @scala.inline
  def apply(properties: SchemaSheetProperties = null): SchemaAddSheetResponse = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddSheetResponse]
  }
}

