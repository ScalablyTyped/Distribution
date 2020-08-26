package typings.jsreportPhantomPdf.mod

import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.landscape
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phantom extends js.Object {
  var blockJavaScript: Boolean = js.native
  var customPhantomJS: Boolean = js.native
  var fitToPage: Boolean = js.native
  var footer: String = js.native
  var footerHeight: String = js.native
  var format: String = js.native
  var header: String = js.native
  var headerHeight: String = js.native
  var height: String = js.native
  var margin: String | Margin = js.native
  var orientation: portrait | landscape = js.native
  var phantomjsVersion: String = js.native
  var resourceTimeout: Double = js.native
  var waitForJS: Boolean = js.native
  var width: String = js.native
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
  @scala.inline
  implicit class PhantomOps[Self <: Phantom] (val x: Self) extends AnyVal {
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
    def setCustomPhantomJS(value: Boolean): Self = this.set("customPhantomJS", value.asInstanceOf[js.Any])
    @scala.inline
    def setFitToPage(value: Boolean): Self = this.set("fitToPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooterHeight(value: String): Self = this.set("footerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderHeight(value: String): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setMargin(value: String | Margin): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: portrait | landscape): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhantomjsVersion(value: String): Self = this.set("phantomjsVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceTimeout(value: Double): Self = this.set("resourceTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaitForJS(value: Boolean): Self = this.set("waitForJS", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

