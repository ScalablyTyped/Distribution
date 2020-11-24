package typings.jsreportPdfUtils.mod.JsReportPdfUtils

import typings.jsreportPdfUtils.anon.Contrent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PdfSign extends js.Object {
  
  var certificateAsset: Contrent = js.native
  
  var reason: String = js.native
}
object PdfSign {
  
  @scala.inline
  def apply(certificateAsset: Contrent, reason: String): PdfSign = {
    val __obj = js.Dynamic.literal(certificateAsset = certificateAsset.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfSign]
  }
  
  @scala.inline
  implicit class PdfSignOps[Self <: PdfSign] (val x: Self) extends AnyVal {
    
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
    def setCertificateAsset(value: Contrent): Self = this.set("certificateAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
