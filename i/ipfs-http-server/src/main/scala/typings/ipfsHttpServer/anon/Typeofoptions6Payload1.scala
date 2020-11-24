package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions6Payload1 extends js.Object {
  
  val payload_1: Typeofpayload1 = js.native
  
  val pre_1: js.Array[AssignMethod] = js.native
  
  val validate_3: Typeofvalidate3 = js.native
}
object Typeofoptions6Payload1 {
  
  @scala.inline
  def apply(payload_1: Typeofpayload1, pre_1: js.Array[AssignMethod], validate_3: Typeofvalidate3): Typeofoptions6Payload1 = {
    val __obj = js.Dynamic.literal(payload_1 = payload_1.asInstanceOf[js.Any], pre_1 = pre_1.asInstanceOf[js.Any], validate_3 = validate_3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions6Payload1]
  }
  
  @scala.inline
  implicit class Typeofoptions6Payload1Ops[Self <: Typeofoptions6Payload1] (val x: Self) extends AnyVal {
    
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
    def setPayload_1(value: Typeofpayload1): Self = this.set("payload_1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPre_1Varargs(value: AssignMethod*): Self = this.set("pre_1", js.Array(value :_*))
    
    @scala.inline
    def setPre_1(value: js.Array[AssignMethod]): Self = this.set("pre_1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate_3(value: Typeofvalidate3): Self = this.set("validate_3", value.asInstanceOf[js.Any])
  }
}
