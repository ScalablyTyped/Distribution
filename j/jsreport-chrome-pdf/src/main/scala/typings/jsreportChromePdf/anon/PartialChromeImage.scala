package typings.jsreportChromePdf.anon

import typings.jsreportChromePdf.jsreportChromePdfStrings.base64
import typings.jsreportChromePdf.jsreportChromePdfStrings.binary
import typings.jsreportChromePdf.jsreportChromePdfStrings.jpeg
import typings.jsreportChromePdf.jsreportChromePdfStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<jsreport-chrome-pdf.jsreport-chrome-pdf.ChromeImage> */
@js.native
trait PartialChromeImage extends js.Object {
  
  var clip: js.UndefOr[Height] = js.native
  
  var encoding: js.UndefOr[base64 | binary] = js.native
  
  var fullPage: js.UndefOr[Boolean] = js.native
  
  var omitBackground: js.UndefOr[Boolean] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var quality: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[jpeg | png] = js.native
}
object PartialChromeImage {
  
  @scala.inline
  def apply(): PartialChromeImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChromeImage]
  }
  
  @scala.inline
  implicit class PartialChromeImageOps[Self <: PartialChromeImage] (val x: Self) extends AnyVal {
    
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
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def setEncoding(value: base64 | binary): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFullPage(value: Boolean): Self = this.set("fullPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullPage: Self = this.set("fullPage", js.undefined)
    
    @scala.inline
    def setOmitBackground(value: Boolean): Self = this.set("omitBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmitBackground: Self = this.set("omitBackground", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setType(value: jpeg | png): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
