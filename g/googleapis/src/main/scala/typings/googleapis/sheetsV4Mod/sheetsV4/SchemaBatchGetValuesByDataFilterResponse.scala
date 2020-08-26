package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response when retrieving more than one range of values in a spreadsheet
  * selected by DataFilters.
  */
@js.native
trait SchemaBatchGetValuesByDataFilterResponse extends js.Object {
  /**
    * The ID of the spreadsheet the data was retrieved from.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * The requested values with the list of data filters that matched them.
    */
  var valueRanges: js.UndefOr[js.Array[SchemaMatchedValueRange]] = js.native
}

object SchemaBatchGetValuesByDataFilterResponse {
  @scala.inline
  def apply(): SchemaBatchGetValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetValuesByDataFilterResponse]
  }
  @scala.inline
  implicit class SchemaBatchGetValuesByDataFilterResponseOps[Self <: SchemaBatchGetValuesByDataFilterResponse] (val x: Self) extends AnyVal {
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
    def setValueRangesVarargs(value: SchemaMatchedValueRange*): Self = this.set("valueRanges", js.Array(value :_*))
    @scala.inline
    def setValueRanges(value: js.Array[SchemaMatchedValueRange]): Self = this.set("valueRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueRanges: Self = this.set("valueRanges", js.undefined)
  }
  
}

