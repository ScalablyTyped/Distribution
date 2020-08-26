package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Refreshes an embedded Google Sheets chart by replacing it with the latest
  * version of the chart from Google Sheets.  NOTE: Refreshing charts requires
  * at least one of the spreadsheets.readonly, spreadsheets, drive.readonly, or
  * drive OAuth scopes.
  */
@js.native
trait SchemaRefreshSheetsChartRequest extends js.Object {
  /**
    * The object ID of the chart to refresh.
    */
  var objectId: js.UndefOr[String] = js.native
}

object SchemaRefreshSheetsChartRequest {
  @scala.inline
  def apply(): SchemaRefreshSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRefreshSheetsChartRequest]
  }
  @scala.inline
  implicit class SchemaRefreshSheetsChartRequestOps[Self <: SchemaRefreshSheetsChartRequest] (val x: Self) extends AnyVal {
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
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
  }
  
}

