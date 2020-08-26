package typings.jsreportPhantomPdf.anon

import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.landscape
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.portrait
import typings.jsreportPhantomPdf.mod.Margin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-phantom-pdf.jsreport-phantom-pdf.Phantom> */
@js.native
trait PartialPhantom extends js.Object {
  var blockJavaScript: js.UndefOr[Boolean] = js.native
  var customPhantomJS: js.UndefOr[Boolean] = js.native
  var fitToPage: js.UndefOr[Boolean] = js.native
  var footer: js.UndefOr[String] = js.native
  var footerHeight: js.UndefOr[String] = js.native
  var format: js.UndefOr[String] = js.native
  var header: js.UndefOr[String] = js.native
  var headerHeight: js.UndefOr[String] = js.native
  var height: js.UndefOr[String] = js.native
  var margin: js.UndefOr[String | Margin] = js.native
  var orientation: js.UndefOr[portrait | landscape] = js.native
  var phantomjsVersion: js.UndefOr[String] = js.native
  var resourceTimeout: js.UndefOr[Double] = js.native
  var waitForJS: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[String] = js.native
}

object PartialPhantom {
  @scala.inline
  def apply(): PartialPhantom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPhantom]
  }
  @scala.inline
  implicit class PartialPhantomOps[Self <: PartialPhantom] (val x: Self) extends AnyVal {
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
    def setBlockJavaScript(value: Boolean): Self = this.set("blockJavaScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockJavaScript: Self = this.set("blockJavaScript", js.undefined)
    @scala.inline
    def setCustomPhantomJS(value: Boolean): Self = this.set("customPhantomJS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomPhantomJS: Self = this.set("customPhantomJS", js.undefined)
    @scala.inline
    def setFitToPage(value: Boolean): Self = this.set("fitToPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitToPage: Self = this.set("fitToPage", js.undefined)
    @scala.inline
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setFooterHeight(value: String): Self = this.set("footerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterHeight: Self = this.set("footerHeight", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderHeight(value: String): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMargin(value: String | Margin): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOrientation(value: portrait | landscape): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPhantomjsVersion(value: String): Self = this.set("phantomjsVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhantomjsVersion: Self = this.set("phantomjsVersion", js.undefined)
    @scala.inline
    def setResourceTimeout(value: Double): Self = this.set("resourceTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceTimeout: Self = this.set("resourceTimeout", js.undefined)
    @scala.inline
    def setWaitForJS(value: Boolean): Self = this.set("waitForJS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForJS: Self = this.set("waitForJS", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

