package typings
package jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfMod.JsReportPhantomPdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phantom extends js.Object {
  var blockJavaScript: scala.Boolean
  var customPhantomJS: scala.Boolean
  var fitToPage: scala.Boolean
  var footer: java.lang.String
  var footerHeight: java.lang.String
  var format: java.lang.String
  var header: java.lang.String
  var headerHeight: java.lang.String
  var height: java.lang.String
  var margin: java.lang.String | Margin
  var orientation: jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfLibStrings.portrait | jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfLibStrings.landscape
  var phantomjsVersion: java.lang.String
  var resourceTimeout: scala.Double
  var waitForJS: scala.Boolean
  var width: java.lang.String
}

object Phantom {
  @scala.inline
  def apply(
    blockJavaScript: scala.Boolean,
    customPhantomJS: scala.Boolean,
    fitToPage: scala.Boolean,
    footer: java.lang.String,
    footerHeight: java.lang.String,
    format: java.lang.String,
    header: java.lang.String,
    headerHeight: java.lang.String,
    height: java.lang.String,
    margin: java.lang.String | Margin,
    orientation: jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfLibStrings.portrait | jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfLibStrings.landscape,
    phantomjsVersion: java.lang.String,
    resourceTimeout: scala.Double,
    waitForJS: scala.Boolean,
    width: java.lang.String
  ): Phantom = {
    val __obj = js.Dynamic.literal(blockJavaScript = blockJavaScript, customPhantomJS = customPhantomJS, fitToPage = fitToPage, footer = footer, footerHeight = footerHeight, format = format, header = header, headerHeight = headerHeight, height = height, margin = margin.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], phantomjsVersion = phantomjsVersion, resourceTimeout = resourceTimeout, waitForJS = waitForJS, width = width)
  
    __obj.asInstanceOf[Phantom]
  }
}

