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
  def apply(): SchemaBatchUpdateSpreadsheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateSpreadsheetResponse]
  }
  @scala.inline
  implicit class SchemaBatchUpdateSpreadsheetResponseOps[Self <: SchemaBatchUpdateSpreadsheetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRepliesVarargs(value: SchemaResponse*): Self = this.set("replies", js.Array(value :_*))
    @scala.inline
    def setReplies(value: js.Array[SchemaResponse]): Self = this.set("replies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
    @scala.inline
    def setUpdatedSpreadsheet(value: SchemaSpreadsheet): Self = this.set("updatedSpreadsheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedSpreadsheet: Self = this.set("updatedSpreadsheet", js.undefined)
  }
  
}

