package typings.jsreportDashChromeDashPdf.jsreportDashChromeDashPdfMod

import typings.jsreportDashChromeDashPdf.Anon_Height
import typings.jsreportDashChromeDashPdf.jsreportDashChromeDashPdfStrings.base64
import typings.jsreportDashChromeDashPdf.jsreportDashChromeDashPdfStrings.binary
import typings.jsreportDashChromeDashPdf.jsreportDashChromeDashPdfStrings.jpeg
import typings.jsreportDashChromeDashPdf.jsreportDashChromeDashPdfStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://jsreport.net/learn/chrome-image
// https://github.com/puppeteer/puppeteer/blob/v1.11.0/docs/api.md#pagescreenshotoptions
trait ChromeImage extends js.Object {
  var clip: Anon_Height
  var encoding: base64 | binary
  	// 0-100
  var fullPage: Boolean
  var omitBackground: Boolean
  var path: String
  var quality: Double
  var `type`: jpeg | png
}

object ChromeImage {
  @scala.inline
  def apply(
    clip: Anon_Height,
    encoding: base64 | binary,
    fullPage: Boolean,
    omitBackground: Boolean,
    path: String,
    quality: Double,
    `type`: jpeg | png
  ): ChromeImage = {
    val __obj = js.Dynamic.literal(clip = clip.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], fullPage = fullPage.asInstanceOf[js.Any], omitBackground = omitBackground.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeImage]
  }
}

