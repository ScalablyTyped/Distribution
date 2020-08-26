package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response when updating a range of values in a spreadsheet.
  */
@js.native
trait SchemaAppendValuesResponse extends js.Object {
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * The range (in A1 notation) of the table that values are being appended to
    * (before the values were appended). Empty if no table was found.
    */
  var tableRange: js.UndefOr[String] = js.native
  /**
    * Information about the updates that were applied.
    */
  var updates: js.UndefOr[SchemaUpdateValuesResponse] = js.native
}

object SchemaAppendValuesResponse {
  @scala.inline
  def apply(): SchemaAppendValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppendValuesResponse]
  }
  @scala.inline
  implicit class SchemaAppendValuesResponseOps[Self <: SchemaAppendValuesResponse] (val x: Self) extends AnyVal {
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
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadsheetId: Self = this.set("spreadsheetId", js.undefined)
    @scala.inline
    def setTableRange(value: String): Self = this.set("tableRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRange: Self = this.set("tableRange", js.undefined)
    @scala.inline
    def setUpdates(value: SchemaUpdateValuesResponse): Self = this.set("updates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdates: Self = this.set("updates", js.undefined)
  }
  
}

