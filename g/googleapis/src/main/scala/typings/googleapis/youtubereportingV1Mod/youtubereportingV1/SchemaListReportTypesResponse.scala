package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ReportingService.ListReportTypes.
  */
@js.native
trait SchemaListReportTypesResponse extends js.Object {
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListReportTypesRequest.page_token field in the subsequent call to
    * `ListReportTypes` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of report types.
    */
  var reportTypes: js.UndefOr[js.Array[SchemaReportType]] = js.native
}

object SchemaListReportTypesResponse {
  @scala.inline
  def apply(): SchemaListReportTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReportTypesResponse]
  }
  @scala.inline
  implicit class SchemaListReportTypesResponseOps[Self <: SchemaListReportTypesResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setReportTypesVarargs(value: SchemaReportType*): Self = this.set("reportTypes", js.Array(value :_*))
    @scala.inline
    def setReportTypes(value: js.Array[SchemaReportType]): Self = this.set("reportTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportTypes: Self = this.set("reportTypes", js.undefined)
  }
  
}

