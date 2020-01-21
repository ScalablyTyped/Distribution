package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes the requested sheet.
  */
@js.native
trait SchemaDeleteSheetRequest extends js.Object {
  /**
    * The ID of the sheet to delete.
    */
  var sheetId: js.UndefOr[Double] = js.native
}

object SchemaDeleteSheetRequest {
  @scala.inline
  def apply(sheetId: Int | Double = null): SchemaDeleteSheetRequest = {
    val __obj = js.Dynamic.literal()
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteSheetRequest]
  }
}

