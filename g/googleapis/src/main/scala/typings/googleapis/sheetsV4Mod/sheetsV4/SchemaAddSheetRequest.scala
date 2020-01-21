package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a new sheet. When a sheet is added at a given index, all subsequent
  * sheets&#39; indexes are incremented. To add an object sheet, use
  * AddChartRequest instead and specify EmbeddedObjectPosition.sheetId or
  * EmbeddedObjectPosition.newSheet.
  */
@js.native
trait SchemaAddSheetRequest extends js.Object {
  /**
    * The properties the new sheet should have. All properties are optional.
    * The sheetId field is optional; if one is not set, an id will be randomly
    * generated. (It is an error to specify the ID of a sheet that already
    * exists.)
    */
  var properties: js.UndefOr[SchemaSheetProperties] = js.native
}

object SchemaAddSheetRequest {
  @scala.inline
  def apply(properties: SchemaSheetProperties = null): SchemaAddSheetRequest = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddSheetRequest]
  }
}

