package typings.jsreportChromePdf.mod

import typings.jsreportChromePdf.AnonBottom
import typings.jsreportChromePdf.jsreportChromePdfStrings.print
import typings.jsreportChromePdf.jsreportChromePdfStrings.screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://jsreport.net/learn/chrome-pdf
// https://github.com/puppeteer/puppeteer/blob/master/docs/api.md#pagepdfoptions
trait Chrome extends js.Object {
  var displayHeaderFooter: Boolean
  var footerTemplate: String
  	// 1-5, 8, 11-13
  var format: String
  // https://github.com/jsreport/jsreport-chrome-pdf/blob/master/test/chromeTest.js
  var header: String
  var headerTemplate: String
  var height: String | Double
  var landscape: Boolean
  var margin: AnonBottom
  var marginBottom: String | Double
  var marginLeft: String | Double
  var marginRight: String | Double
  // https://jsreport.net/learn/chrome-pdf
  var marginTop: String | Double
  var mediaType: screen | print
  var pageNumber: Double
  var pageRanges: String
  var path: String
  var preferCSSPageSize: Boolean
  var printBackground: Boolean
  var scale: Double
  var totalPages: Double
  var url: String
  var waitForJS: Boolean
  var waitForNetworkIddle: Boolean
  var width: String | Double
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
    margin: AnonBottom,
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
}

