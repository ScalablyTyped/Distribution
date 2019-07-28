package typings.jsreportDashPhantomDashPdf.jsreportDashPhantomDashPdfMod

import typings.jsreportDashPhantomDashPdf.jsreportDashPhantomDashPdfStrings.landscape
import typings.jsreportDashPhantomDashPdf.jsreportDashPhantomDashPdfStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phantom extends js.Object {
  var blockJavaScript: Boolean
  var customPhantomJS: Boolean
  var fitToPage: Boolean
  var footer: String
  var footerHeight: String
  var format: String
  var header: String
  var headerHeight: String
  var height: String
  var margin: String | Margin
  var orientation: portrait | landscape
  var phantomjsVersion: String
  var resourceTimeout: Double
  var waitForJS: Boolean
  var width: String
}

object Phantom {
  @scala.inline
  def apply(
    blockJavaScript: Boolean,
    customPhantomJS: Boolean,
    fitToPage: Boolean,
    footer: String,
    footerHeight: String,
    format: String,
    header: String,
    headerHeight: String,
    height: String,
    margin: String | Margin,
    orientation: portrait | landscape,
    phantomjsVersion: String,
    resourceTimeout: Double,
    waitForJS: Boolean,
    width: String
  ): Phantom = {
    val __obj = js.Dynamic.literal(blockJavaScript = blockJavaScript, customPhantomJS = customPhantomJS, fitToPage = fitToPage, footer = footer, footerHeight = footerHeight, format = format, header = header, headerHeight = headerHeight, height = height, margin = margin.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], phantomjsVersion = phantomjsVersion, resourceTimeout = resourceTimeout, waitForJS = waitForJS, width = width)
  
    __obj.asInstanceOf[Phantom]
  }
}

