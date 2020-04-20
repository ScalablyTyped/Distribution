package typings.jsreportPhantomPdf.mod

import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.landscape
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.portrait
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
    val __obj = js.Dynamic.literal(blockJavaScript = blockJavaScript.asInstanceOf[js.Any], customPhantomJS = customPhantomJS.asInstanceOf[js.Any], fitToPage = fitToPage.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], footerHeight = footerHeight.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], phantomjsVersion = phantomjsVersion.asInstanceOf[js.Any], resourceTimeout = resourceTimeout.asInstanceOf[js.Any], waitForJS = waitForJS.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phantom]
  }
}

