package typings.kendoUi.kendo.dataviz.drawing

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFOptions extends js.Object {
  var creator: js.UndefOr[String] = js.native
  var date: js.UndefOr[Date] = js.native
  var imgDPI: js.UndefOr[Double] = js.native
  var keywords: js.UndefOr[String] = js.native
  var landscape: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[js.Any] = js.native
  var paperSize: js.UndefOr[js.Any] = js.native
  var subject: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object PDFOptions {
  @scala.inline
  def apply(): PDFOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFOptions]
  }
  @scala.inline
  implicit class PDFOptionsOps[Self <: PDFOptions] (val x: Self) extends AnyVal {
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
    def setCreator(value: String): Self = this.set("creator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreator: Self = this.set("creator", js.undefined)
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setImgDPI(value: Double): Self = this.set("imgDPI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgDPI: Self = this.set("imgDPI", js.undefined)
    @scala.inline
    def setKeywords(value: String): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setLandscape(value: Boolean): Self = this.set("landscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLandscape: Self = this.set("landscape", js.undefined)
    @scala.inline
    def setMargin(value: js.Any): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setPaperSize(value: js.Any): Self = this.set("paperSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperSize: Self = this.set("paperSize", js.undefined)
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

