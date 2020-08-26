package typings.mangopay2NodejsSdk.mod.report

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CSV
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.report.ReportData, 'Tag' | 'CallbackURL' | 'DownloadFormat' | 'Sort' | 'Preview' | 'Filters' | 'Columns'> */
@js.native
trait CreateReport extends js.Object {
  var CallbackURL: js.UndefOr[String] = js.native
  var Columns: js.UndefOr[js.Array[Column]] = js.native
  var DownloadFormat: js.UndefOr[CSV] = js.native
  var Filters: js.UndefOr[typings.mangopay2NodejsSdk.mod.report.Filters] = js.native
  var Preview: js.UndefOr[Boolean] = js.native
  var Sort: js.UndefOr[String] = js.native
  var Tag: js.UndefOr[String] = js.native
}

object CreateReport {
  @scala.inline
  def apply(): CreateReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReport]
  }
  @scala.inline
  implicit class CreateReportOps[Self <: CreateReport] (val x: Self) extends AnyVal {
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
    def setDownloadFormat(value: CSV): Self = this.set("DownloadFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadFormat: Self = this.set("DownloadFormat", js.undefined)
    @scala.inline
    def setFilters(value: Filters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setPreview(value: Boolean): Self = this.set("Preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("Preview", js.undefined)
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

