package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions2Pre extends js.Object {
  
  val payload: Typeofpayload = js.native
  
  val pre: js.Array[AssignString] = js.native
  
  val validate_1: Typeofvalidate1 = js.native
}
object Typeofoptions2Pre {
  
  @scala.inline
  def apply(payload: Typeofpayload, pre: js.Array[AssignString], validate_1: Typeofvalidate1): Typeofoptions2Pre = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], validate_1 = validate_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions2Pre]
  }
  
  @scala.inline
  implicit class Typeofoptions2PreOps[Self <: Typeofoptions2Pre] (val x: Self) extends AnyVal {
    
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
    def setPreVarargs(value: AssignString*): Self = this.set("pre", js.Array(value :_*))
    
    @scala.inline
    def setPre(value: js.Array[AssignString]): Self = this.set("pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate_1(value: Typeofvalidate1): Self = this.set("validate_1", value.asInstanceOf[js.Any])
  }
}
