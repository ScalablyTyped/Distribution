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
  def apply(): SchemaReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReport]
  }
  @scala.inline
  implicit class SchemaReportOps[Self <: SchemaReport] (val x: Self) extends AnyVal {
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
    def setColumnHeader(value: SchemaColumnHeader): Self = this.set("columnHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnHeader: Self = this.set("columnHeader", js.undefined)
    @scala.inline
    def setData(value: SchemaReportData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

