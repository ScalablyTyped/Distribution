package typings.jszip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSZipSupport extends js.Object {
  
  var arraybuffer: Boolean = js.native
  
  var blob: Boolean = js.native
  
  var nodebuffer: Boolean = js.native
  
  var uint8array: Boolean = js.native
}
object JSZipSupport {
  
  @scala.inline
  def apply(arraybuffer: Boolean, blob: Boolean, nodebuffer: Boolean, uint8array: Boolean): JSZipSupport = {
    val __obj = js.Dynamic.literal(arraybuffer = arraybuffer.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], nodebuffer = nodebuffer.asInstanceOf[js.Any], uint8array = uint8array.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSZipSupport]
  }
  
  @scala.inline
  implicit class JSZipSupportOps[Self <: JSZipSupport] (val x: Self) extends AnyVal {
    
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
    def setArraybuffer(value: Boolean): Self = this.set("arraybuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlob(value: Boolean): Self = this.set("blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodebuffer(value: Boolean): Self = this.set("nodebuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUint8array(value: Boolean): Self = this.set("uint8array", value.asInstanceOf[js.Any])
  }
}
