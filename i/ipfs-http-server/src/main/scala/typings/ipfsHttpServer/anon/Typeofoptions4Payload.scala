package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions4Payload extends js.Object {
  
  val payload: Typeofpayload = js.native
  
  val pre: js.Array[AssignStringMethod] = js.native
  
  val validate_2: Typeofvalidate2 = js.native
}
object Typeofoptions4Payload {
  
  @scala.inline
  def apply(payload: Typeofpayload, pre: js.Array[AssignStringMethod], validate_2: Typeofvalidate2): Typeofoptions4Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], validate_2 = validate_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions4Payload]
  }
  
  @scala.inline
  implicit class Typeofoptions4PayloadOps[Self <: Typeofoptions4Payload] (val x: Self) extends AnyVal {
    
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
    def setPreVarargs(value: AssignStringMethod*): Self = this.set("pre", js.Array(value :_*))
    
    @scala.inline
    def setPre(value: js.Array[AssignStringMethod]): Self = this.set("pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate_2(value: Typeofvalidate2): Self = this.set("validate_2", value.asInstanceOf[js.Any])
  }
}
