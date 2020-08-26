package typings.jsreportChromePdf.mod

import typings.jsreportChromePdf.anon.Bottom
import typings.jsreportChromePdf.jsreportChromePdfStrings.print
import typings.jsreportChromePdf.jsreportChromePdfStrings.screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://jsreport.net/learn/chrome-pdf
// https://github.com/puppeteer/puppeteer/blob/master/docs/api.md#pagepdfoptions
@js.native
trait Chrome extends js.Object {
  var displayHeaderFooter: Boolean = js.native
  var footerTemplate: String = js.native
      // 1-5, 8, 11-13
  var format: String = js.native
  // https://github.com/jsreport/jsreport-chrome-pdf/blob/master/test/chromeTest.js
  var header: String = js.native
  var headerTemplate: String = js.native
  var height: String | Double = js.native
  var landscape: Boolean = js.native
  var margin: Bottom = js.native
  var marginBottom: String | Double = js.native
  var marginLeft: String | Double = js.native
  var marginRight: String | Double = js.native
  // https://jsreport.net/learn/chrome-pdf
  var marginTop: String | Double = js.native
  var mediaType: screen | print = js.native
  var pageNumber: Double = js.native
  var pageRanges: String = js.native
  var path: String = js.native
  var preferCSSPageSize: Boolean = js.native
  var printBackground: Boolean = js.native
  var scale: Double = js.native
  var totalPages: Double = js.native
  var url: String = js.native
  var waitForJS: Boolean = js.native
  var waitForNetworkIddle: Boolean = js.native
  var width: String | Double = js.native
}

object Chrome {
  @scala.inline
  def apply(
    displayHeaderFooter: Boolean,
    footerTemplate: String,
    format: String,
    header: String,
    headerTemplate: String,
    height: String | Double,
    landscape: Boolean,
    margin: Bottom,
    marginBottom: String | Double,
    marginLeft: String | Double,
    marginRight: String | Double,
    marginTop: String | Double,
    mediaType: screen | print,
    pageNumber: Double,
    pageRanges: String,
    path: String,
    preferCSSPageSize: Boolean,
    printBackground: Boolean,
    scale: Double,
    totalPages: Double,
    url: String,
    waitForJS: Boolean,
    waitForNetworkIddle: Boolean,
    width: String | Double
  ): Chrome = {
    val __obj = js.Dynamic.literal(displayHeaderFooter = displayHeaderFooter.asInstanceOf[js.Any], footerTemplate = footerTemplate.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerTemplate = headerTemplate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], landscape = landscape.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageRanges = pageRanges.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], preferCSSPageSize = preferCSSPageSize.asInstanceOf[js.Any], printBackground = printBackground.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], waitForJS = waitForJS.asInstanceOf[js.Any], waitForNetworkIddle = waitForNetworkIddle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chrome]
  }
  @scala.inline
  implicit class ChromeOps[Self <: Chrome] (val x: Self) extends AnyVal {
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
    def setFooterTemplate(value: String): Self = this.set("footerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderTemplate(value: String): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLandscape(value: Boolean): Self = this.set("landscape", value.asInstanceOf[js.Any])
    @scala.inline
    def setMargin(value: Bottom): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginBottom(value: String | Double): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginLeft(value: String | Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginRight(value: String | Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginTop(value: String | Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: screen | print): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageRanges(value: String): Self = this.set("pageRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreferCSSPageSize(value: Boolean): Self = this.set("preferCSSPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintBackground(value: Boolean): Self = this.set("printBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalPages(value: Double): Self = this.set("totalPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaitForJS(value: Boolean): Self = this.set("waitForJS", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaitForNetworkIddle(value: Boolean): Self = this.set("waitForNetworkIddle", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

