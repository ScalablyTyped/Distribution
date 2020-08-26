package typings.jsreportChromePdf.anon

import typings.jsreportChromePdf.jsreportChromePdfStrings.print
import typings.jsreportChromePdf.jsreportChromePdfStrings.screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-chrome-pdf.jsreport-chrome-pdf.Chrome> */
@js.native
trait PartialChrome extends js.Object {
  var displayHeaderFooter: js.UndefOr[Boolean] = js.native
  var footerTemplate: js.UndefOr[String] = js.native
  var format: js.UndefOr[String] = js.native
  var header: js.UndefOr[String] = js.native
  var headerTemplate: js.UndefOr[String] = js.native
  var height: js.UndefOr[String | Double] = js.native
  var landscape: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[Bottom] = js.native
  var marginBottom: js.UndefOr[String | Double] = js.native
  var marginLeft: js.UndefOr[String | Double] = js.native
  var marginRight: js.UndefOr[String | Double] = js.native
  var marginTop: js.UndefOr[String | Double] = js.native
  var mediaType: js.UndefOr[screen | print] = js.native
  var pageNumber: js.UndefOr[Double] = js.native
  var pageRanges: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var preferCSSPageSize: js.UndefOr[Boolean] = js.native
  var printBackground: js.UndefOr[Boolean] = js.native
  var scale: js.UndefOr[Double] = js.native
  var totalPages: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
  var waitForJS: js.UndefOr[Boolean] = js.native
  var waitForNetworkIddle: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object PartialChrome {
  @scala.inline
  def apply(): PartialChrome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChrome]
  }
  @scala.inline
  implicit class PartialChromeOps[Self <: PartialChrome] (val x: Self) extends AnyVal {
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
    def setDisplayHeaderFooter(value: Boolean): Self = this.set("displayHeaderFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayHeaderFooter: Self = this.set("displayHeaderFooter", js.undefined)
    @scala.inline
    def setFooterTemplate(value: String): Self = this.set("footerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterTemplate: Self = this.set("footerTemplate", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderTemplate(value: String): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLandscape(value: Boolean): Self = this.set("landscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLandscape: Self = this.set("landscape", js.undefined)
    @scala.inline
    def setMargin(value: Bottom): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMarginBottom(value: String | Double): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    @scala.inline
    def setMarginLeft(value: String | Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginRight(value: String | Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    @scala.inline
    def setMarginTop(value: String | Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setMediaType(value: screen | print): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    @scala.inline
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageNumber: Self = this.set("pageNumber", js.undefined)
    @scala.inline
    def setPageRanges(value: String): Self = this.set("pageRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageRanges: Self = this.set("pageRanges", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPreferCSSPageSize(value: Boolean): Self = this.set("preferCSSPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferCSSPageSize: Self = this.set("preferCSSPageSize", js.undefined)
    @scala.inline
    def setPrintBackground(value: Boolean): Self = this.set("printBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintBackground: Self = this.set("printBackground", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setTotalPages(value: Double): Self = this.set("totalPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalPages: Self = this.set("totalPages", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWaitForJS(value: Boolean): Self = this.set("waitForJS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForJS: Self = this.set("waitForJS", js.undefined)
    @scala.inline
    def setWaitForNetworkIddle(value: Boolean): Self = this.set("waitForNetworkIddle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForNetworkIddle: Self = this.set("waitForNetworkIddle", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

