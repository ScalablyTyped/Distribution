package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofoptionsPayload extends js.Object {
  
  val payload: Typeofpayload = js.native
  
  val pre: js.Array[Method] = js.native
  
  val validate: Typeofvalidate = js.native
}
object TypeofoptionsPayload {
  
  @scala.inline
  def apply(payload: Typeofpayload, pre: js.Array[Method], validate: Typeofvalidate): TypeofoptionsPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofoptionsPayload]
  }
  
  @scala.inline
  implicit class TypeofoptionsPayloadOps[Self <: TypeofoptionsPayload] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: Typeofpayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreVarargs(value: Method*): Self = this.set("pre", js.Array(value :_*))
    
    @scala.inline
    def setPre(value: js.Array[Method]): Self = this.set("pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: Typeofvalidate): Self = this.set("validate", value.asInstanceOf[js.Any])
  }
}
