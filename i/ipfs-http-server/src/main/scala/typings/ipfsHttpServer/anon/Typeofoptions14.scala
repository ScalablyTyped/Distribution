package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions14 extends js.Object {
  
  val payload_2: Typeofpayload2 = js.native
  
  val pre_2: js.Array[AssignStringMethod] = js.native
  
  val validate_7: Typeofvalidate7 = js.native
}
object Typeofoptions14 {
  
  @scala.inline
  def apply(payload_2: Typeofpayload2, pre_2: js.Array[AssignStringMethod], validate_7: Typeofvalidate7): Typeofoptions14 = {
    val __obj = js.Dynamic.literal(payload_2 = payload_2.asInstanceOf[js.Any], pre_2 = pre_2.asInstanceOf[js.Any], validate_7 = validate_7.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions14]
  }
  
  @scala.inline
  implicit class Typeofoptions14Ops[Self <: Typeofoptions14] (val x: Self) extends AnyVal {
    
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
    def setPayload_2(value: Typeofpayload2): Self = this.set("payload_2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPre_2Varargs(value: AssignStringMethod*): Self = this.set("pre_2", js.Array(value :_*))
    
    @scala.inline
    def setPre_2(value: js.Array[AssignStringMethod]): Self = this.set("pre_2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate_7(value: Typeofvalidate7): Self = this.set("validate_7", value.asInstanceOf[js.Any])
  }
}
