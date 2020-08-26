package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for retrieving a Spreadsheet.
  */
@js.native
trait SchemaGetSpreadsheetByDataFilterRequest extends js.Object {
  /**
    * The DataFilters used to select which ranges to retrieve from the
    * spreadsheet.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
  /**
    * True if grid data should be returned. This parameter is ignored if a
    * field mask was set in the request.
    */
  var includeGridData: js.UndefOr[Boolean] = js.native
}

object SchemaGetSpreadsheetByDataFilterRequest {
  @scala.inline
  def apply(): SchemaGetSpreadsheetByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetSpreadsheetByDataFilterRequest]
  }
  @scala.inline
  implicit class SchemaGetSpreadsheetByDataFilterRequestOps[Self <: SchemaGetSpreadsheetByDataFilterRequest] (val x: Self) extends AnyVal {
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
    def setDataFiltersVarargs(value: SchemaDataFilter*): Self = this.set("dataFilters", js.Array(value :_*))
    @scala.inline
    def setDataFilters(value: js.Array[SchemaDataFilter]): Self = this.set("dataFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFilters: Self = this.set("dataFilters", js.undefined)
    @scala.inline
    def setIncludeGridData(value: Boolean): Self = this.set("includeGridData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeGridData: Self = this.set("includeGridData", js.undefined)
  }
  
}

