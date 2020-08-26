package typings.kendoUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGridPdf extends js.Object {
  var author: js.UndefOr[String] = js.native
  var avoidLinks: js.UndefOr[Boolean | String] = js.native
  var creator: js.UndefOr[String] = js.native
  var date: js.UndefOr[Date] = js.native
  var fileName: js.UndefOr[String] = js.native
  var forceProxy: js.UndefOr[Boolean] = js.native
  var keywords: js.UndefOr[String] = js.native
  var landscape: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[PivotGridPdfMargin] = js.native
  var paperSize: js.UndefOr[String | js.Any] = js.native
  var proxyTarget: js.UndefOr[String] = js.native
  var proxyURL: js.UndefOr[String] = js.native
  var subject: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object PivotGridPdf {
  @scala.inline
  def apply(): PivotGridPdf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridPdf]
  }
  @scala.inline
  implicit class PivotGridPdfOps[Self <: PivotGridPdf] (val x: Self) extends AnyVal {
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setAvoidLinks(value: Boolean | String): Self = this.set("avoidLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvoidLinks: Self = this.set("avoidLinks", js.undefined)
    @scala.inline
    def setCreator(value: String): Self = this.set("creator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreator: Self = this.set("creator", js.undefined)
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setForceProxy(value: Boolean): Self = this.set("forceProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceProxy: Self = this.set("forceProxy", js.undefined)
    @scala.inline
    def setKeywords(value: String): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setLandscape(value: Boolean): Self = this.set("landscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLandscape: Self = this.set("landscape", js.undefined)
    @scala.inline
    def setMargin(value: PivotGridPdfMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setPaperSize(value: String | js.Any): Self = this.set("paperSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperSize: Self = this.set("paperSize", js.undefined)
    @scala.inline
    def setProxyTarget(value: String): Self = this.set("proxyTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyTarget: Self = this.set("proxyTarget", js.undefined)
    @scala.inline
    def setProxyURL(value: String): Self = this.set("proxyURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyURL: Self = this.set("proxyURL", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

