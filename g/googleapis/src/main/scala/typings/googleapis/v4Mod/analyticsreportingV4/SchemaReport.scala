package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The data response corresponding to the request.
  */
@js.native
trait SchemaReport extends js.Object {
  /**
    * The column headers.
    */
  var columnHeader: js.UndefOr[SchemaColumnHeader] = js.native
  /**
    * Response data.
    */
  var data: js.UndefOr[SchemaReportData] = js.native
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaReport {
  @scala.inline
  def apply(
    columnHeader: SchemaColumnHeader = null,
    data: SchemaReportData = null,
    nextPageToken: String = null
  ): SchemaReport = {
    val __obj = js.Dynamic.literal()
    if (columnHeader != null) __obj.updateDynamic("columnHeader")(columnHeader.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReport]
  }
}

