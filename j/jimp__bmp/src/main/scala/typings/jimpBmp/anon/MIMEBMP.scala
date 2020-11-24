package typings.jimpBmp.anon

import typings.jimpBmp.jimpBmpStrings.`imageSlashx-ms-bmp`
import typings.jimpBmp.jimpBmpStrings.imageSlashbmp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MIMEBMP extends js.Object {
  
  var MIME_BMP: imageSlashbmp = js.native
  
  var MIME_X_MS_BMP: `imageSlashx-ms-bmp` = js.native
}
object MIMEBMP {
  
  @scala.inline
  def apply(MIME_BMP: imageSlashbmp, MIME_X_MS_BMP: `imageSlashx-ms-bmp`): MIMEBMP = {
    val __obj = js.Dynamic.literal(MIME_BMP = MIME_BMP.asInstanceOf[js.Any], MIME_X_MS_BMP = MIME_X_MS_BMP.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIMEBMP]
  }
  
  @scala.inline
  implicit class MIMEBMPOps[Self <: MIMEBMP] (val x: Self) extends AnyVal {
    
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
    def setMIME_BMP(value: imageSlashbmp): Self = this.set("MIME_BMP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIME_X_MS_BMP(value: `imageSlashx-ms-bmp`): Self = this.set("MIME_X_MS_BMP", value.asInstanceOf[js.Any])
  }
}
