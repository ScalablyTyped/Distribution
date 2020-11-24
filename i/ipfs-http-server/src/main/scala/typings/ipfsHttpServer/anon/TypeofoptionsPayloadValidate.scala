package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofoptionsPayloadValidate extends js.Object {
  
  val payload: Typeofpayload = js.native
  
  val validate: Typeofvalidate = js.native
}
object TypeofoptionsPayloadValidate {
  
  @scala.inline
  def apply(payload: Typeofpayload, validate: Typeofvalidate): TypeofoptionsPayloadValidate = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofoptionsPayloadValidate]
  }
  
  @scala.inline
  implicit class TypeofoptionsPayloadValidateOps[Self <: TypeofoptionsPayloadValidate] (val x: Self) extends AnyVal {
    
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
    def setValidate(value: Typeofvalidate): Self = this.set("validate", value.asInstanceOf[js.Any])
  }
}
