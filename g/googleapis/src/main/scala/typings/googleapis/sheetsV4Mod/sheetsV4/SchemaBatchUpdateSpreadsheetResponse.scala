package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The reply for batch updating a spreadsheet.
  */
@js.native
trait SchemaBatchUpdateSpreadsheetResponse extends js.Object {
  /**
    * The reply of the updates.  This maps 1:1 with the updates, although
    * replies to some requests may be empty.
    */
  var replies: js.UndefOr[js.Array[SchemaResponse]] = js.native
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * The spreadsheet after updates were applied. This is only set if
    * [BatchUpdateSpreadsheetRequest.include_spreadsheet_in_response] is
    * `true`.
    */
  var updatedSpreadsheet: js.UndefOr[SchemaSpreadsheet] = js.native
}

object SchemaBatchUpdateSpreadsheetResponse {
  @scala.inline
  def apply(
    replies: js.Array[SchemaResponse] = null,
    spreadsheetId: String = null,
    updatedSpreadsheet: SchemaSpreadsheet = null
  ): SchemaBatchUpdateSpreadsheetResponse = {
    val __obj = js.Dynamic.literal()
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    if (updatedSpreadsheet != null) __obj.updateDynamic("updatedSpreadsheet")(updatedSpreadsheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchUpdateSpreadsheetResponse]
  }
}

