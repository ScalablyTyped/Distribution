package typings.jsreportChromePdf

import typings.jsreportChromePdf.jsreportChromePdfStrings.base64
import typings.jsreportChromePdf.jsreportChromePdfStrings.binary
import typings.jsreportChromePdf.jsreportChromePdfStrings.jpeg
import typings.jsreportChromePdf.jsreportChromePdfStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-chrome-pdf.jsreport-chrome-pdf.ChromeImage> */
trait PartialChromeImage extends js.Object {
  var clip: js.UndefOr[AnonHeight] = js.undefined
  var encoding: js.UndefOr[base64 | binary] = js.undefined
  var fullPage: js.UndefOr[Boolean] = js.undefined
  var omitBackground: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[jpeg | png] = js.undefined
}

object PartialChromeImage {
  @scala.inline
  def apply(
    clip: AnonHeight = null,
    encoding: base64 | binary = null,
    fullPage: js.UndefOr[Boolean] = js.undefined,
    omitBackground: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    quality: Int | Double = null,
    `type`: jpeg | png = null
  ): PartialChromeImage = {
    val __obj = js.Dynamic.literal()
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(fullPage)) __obj.updateDynamic("fullPage")(fullPage.asInstanceOf[js.Any])
    if (!js.isUndefined(omitBackground)) __obj.updateDynamic("omitBackground")(omitBackground.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialChromeImage]
  }
}

