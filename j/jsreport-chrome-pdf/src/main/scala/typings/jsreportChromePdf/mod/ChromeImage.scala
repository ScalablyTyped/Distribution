package typings.jsreportChromePdf.mod

import typings.jsreportChromePdf.anon.Height
import typings.jsreportChromePdf.jsreportChromePdfStrings.base64
import typings.jsreportChromePdf.jsreportChromePdfStrings.binary
import typings.jsreportChromePdf.jsreportChromePdfStrings.jpeg
import typings.jsreportChromePdf.jsreportChromePdfStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://jsreport.net/learn/chrome-image
// https://github.com/puppeteer/puppeteer/blob/v1.11.0/docs/api.md#pagescreenshotoptions
@js.native
trait ChromeImage extends js.Object {
  
  var clip: Height = js.native
  
  var encoding: base64 | binary = js.native
  
      // 0-100
  var fullPage: Boolean = js.native
  
  var omitBackground: Boolean = js.native
  
  var path: String = js.native
  
  var quality: Double = js.native
  
  var `type`: jpeg | png = js.native
}
object ChromeImage {
  
  @scala.inline
  def apply(
    clip: Height,
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
  
  @scala.inline
  implicit class ChromeImageOps[Self <: ChromeImage] (val x: Self) extends AnyVal {
    
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
    def setClip(value: Height): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: base64 | binary): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullPage(value: Boolean): Self = this.set("fullPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmitBackground(value: Boolean): Self = this.set("omitBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: jpeg | png): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
