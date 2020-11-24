package typings.jimpTiff.anon

import typings.jimpTiff.jimpTiffStrings.imageSlashtiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MIMETIFF extends js.Object {
  
  var MIME_TIFF: imageSlashtiff = js.native
}
object MIMETIFF {
  
  @scala.inline
  def apply(MIME_TIFF: imageSlashtiff): MIMETIFF = {
    val __obj = js.Dynamic.literal(MIME_TIFF = MIME_TIFF.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIMETIFF]
  }
  
  @scala.inline
  implicit class MIMETIFFOps[Self <: MIMETIFF] (val x: Self) extends AnyVal {
    
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
    def setMIME_TIFF(value: imageSlashtiff): Self = this.set("MIME_TIFF", value.asInstanceOf[js.Any])
  }
}
