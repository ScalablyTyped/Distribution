package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to copy a sheet across spreadsheets.
  */
@js.native
trait SchemaCopySheetToAnotherSpreadsheetRequest extends js.Object {
  /**
    * The ID of the spreadsheet to copy the sheet to.
    */
  var destinationSpreadsheetId: js.UndefOr[String] = js.native
}

object SchemaCopySheetToAnotherSpreadsheetRequest {
  @scala.inline
  def apply(destinationSpreadsheetId: String = null): SchemaCopySheetToAnotherSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    if (destinationSpreadsheetId != null) __obj.updateDynamic("destinationSpreadsheetId")(destinationSpreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCopySheetToAnotherSpreadsheetRequest]
  }
}

