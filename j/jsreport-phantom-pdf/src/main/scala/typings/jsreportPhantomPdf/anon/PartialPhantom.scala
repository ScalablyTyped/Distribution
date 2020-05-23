package typings.jsreportPhantomPdf.anon

import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.landscape
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.portrait
import typings.jsreportPhantomPdf.mod.Margin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-phantom-pdf.jsreport-phantom-pdf.Phantom> */
trait PartialPhantom extends js.Object {
  var blockJavaScript: js.UndefOr[Boolean] = js.undefined
  var customPhantomJS: js.UndefOr[Boolean] = js.undefined
  var fitToPage: js.UndefOr[Boolean] = js.undefined
  var footer: js.UndefOr[String] = js.undefined
  var footerHeight: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var headerHeight: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[String | Margin] = js.undefined
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
  var phantomjsVersion: js.UndefOr[String] = js.undefined
  var resourceTimeout: js.UndefOr[Double] = js.undefined
  var waitForJS: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object PartialPhantom {
  @scala.inline
  def apply(
    blockJavaScript: js.UndefOr[Boolean] = js.undefined,
    customPhantomJS: js.UndefOr[Boolean] = js.undefined,
    fitToPage: js.UndefOr[Boolean] = js.undefined,
    footer: String = null,
    footerHeight: String = null,
    format: String = null,
    header: String = null,
    headerHeight: String = null,
    height: String = null,
    margin: String | Margin = null,
    orientation: portrait | landscape = null,
    phantomjsVersion: String = null,
    resourceTimeout: js.UndefOr[Double] = js.undefined,
    waitForJS: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): PartialPhantom = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockJavaScript)) __obj.updateDynamic("blockJavaScript")(blockJavaScript.get.asInstanceOf[js.Any])
    if (!js.isUndefined(customPhantomJS)) __obj.updateDynamic("customPhantomJS")(customPhantomJS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fitToPage)) __obj.updateDynamic("fitToPage")(fitToPage.get.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (footerHeight != null) __obj.updateDynamic("footerHeight")(footerHeight.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (phantomjsVersion != null) __obj.updateDynamic("phantomjsVersion")(phantomjsVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(resourceTimeout)) __obj.updateDynamic("resourceTimeout")(resourceTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForJS)) __obj.updateDynamic("waitForJS")(waitForJS.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPhantom]
  }
}

