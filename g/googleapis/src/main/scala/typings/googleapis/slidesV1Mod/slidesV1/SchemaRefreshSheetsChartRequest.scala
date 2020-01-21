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
  def apply(objectId: String = null): SchemaRefreshSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRefreshSheetsChartRequest]
  }
}

