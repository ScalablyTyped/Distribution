package typings.hellosignEmbedded.mod.HelloSign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorEventPyload extends js.Object {
  
  var code: String = js.native
  
  var signatureId: String = js.native
}
object ErrorEventPyload {
  
  @scala.inline
  def apply(code: String, signatureId: String): ErrorEventPyload = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], signatureId = signatureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEventPyload]
  }
  
  @scala.inline
  implicit class ErrorEventPyloadOps[Self <: ErrorEventPyload] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureId(value: String): Self = this.set("signatureId", value.asInstanceOf[js.Any])
  }
}
