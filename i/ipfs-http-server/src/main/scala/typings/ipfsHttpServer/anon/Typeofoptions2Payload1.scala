package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions2Payload1 extends js.Object {
  
  val payload_1: Typeofpayload1 = js.native
  
  val pre: js.Array[Assign] = js.native
  
  val validate_1: Typeofvalidate1 = js.native
}
object Typeofoptions2Payload1 {
  
  @scala.inline
  def apply(payload_1: Typeofpayload1, pre: js.Array[Assign], validate_1: Typeofvalidate1): Typeofoptions2Payload1 = {
    val __obj = js.Dynamic.literal(payload_1 = payload_1.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], validate_1 = validate_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions2Payload1]
  }
  
  @scala.inline
  implicit class Typeofoptions2Payload1Ops[Self <: Typeofoptions2Payload1] (val x: Self) extends AnyVal {
    
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
    def setPreVarargs(value: Assign*): Self = this.set("pre", js.Array(value :_*))
    
    @scala.inline
    def setPre(value: js.Array[Assign]): Self = this.set("pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate_1(value: Typeofvalidate1): Self = this.set("validate_1", value.asInstanceOf[js.Any])
  }
}
