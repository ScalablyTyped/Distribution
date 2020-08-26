package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CSV
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTIONS
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.report.Column
import typings.mangopay2NodejsSdk.mod.report.Filters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.report.ReportData> */
@js.native
trait PartialReportData extends js.Object {
  var CallbackURL: js.UndefOr[String] = js.native
  var Columns: js.UndefOr[js.Array[Column]] = js.native
  var CreationDate: js.UndefOr[Double] = js.native
  var DownloadFormat: js.UndefOr[CSV] = js.native
  var DownloadURL: js.UndefOr[String] = js.native
  var Filters: js.UndefOr[typings.mangopay2NodejsSdk.mod.report.Filters] = js.native
  var Id: js.UndefOr[String] = js.native
  var Preview: js.UndefOr[Boolean] = js.native
  var ReportDate: js.UndefOr[Timestamp] = js.native
  var ReportType: js.UndefOr[TRANSACTIONS] = js.native
  var ResultCode: js.UndefOr[String] = js.native
  var ResultMessage: js.UndefOr[String] = js.native
  var Sort: js.UndefOr[String] = js.native
  var Tag: js.UndefOr[String] = js.native
}

object PartialReportData {
  @scala.inline
  def apply(): PartialReportData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReportData]
  }
  @scala.inline
  implicit class PartialReportDataOps[Self <: PartialReportData] (val x: Self) extends AnyVal {
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
    def setCallbackURL(value: String): Self = this.set("CallbackURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackURL: Self = this.set("CallbackURL", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = this.set("Columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = this.set("Columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("Columns", js.undefined)
    @scala.inline
    def setCreationDate(value: Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setDownloadFormat(value: CSV): Self = this.set("DownloadFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadFormat: Self = this.set("DownloadFormat", js.undefined)
    @scala.inline
    def setDownloadURL(value: String): Self = this.set("DownloadURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadURL: Self = this.set("DownloadURL", js.undefined)
    @scala.inline
    def setFilters(value: Filters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setPreview(value: Boolean): Self = this.set("Preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("Preview", js.undefined)
    @scala.inline
    def setReportDate(value: Timestamp): Self = this.set("ReportDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportDate: Self = this.set("ReportDate", js.undefined)
    @scala.inline
    def setReportType(value: TRANSACTIONS): Self = this.set("ReportType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportType: Self = this.set("ReportType", js.undefined)
    @scala.inline
    def setResultCode(value: String): Self = this.set("ResultCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultCode: Self = this.set("ResultCode", js.undefined)
    @scala.inline
    def setResultMessage(value: String): Self = this.set("ResultMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultMessage: Self = this.set("ResultMessage", js.undefined)
    @scala.inline
    def setSort(value: String): Self = this.set("Sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("Sort", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

