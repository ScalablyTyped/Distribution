package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions2Payload extends js.Object {
  
  val payload: Typeofpayload = js.native
  
  val pre: js.Array[`0`] = js.native
  
  val validate_1: Typeofvalidate1 = js.native
}
object Typeofoptions2Payload {
  
  @scala.inline
  def apply(payload: Typeofpayload, pre: js.Array[`0`], validate_1: Typeofvalidate1): Typeofoptions2Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], validate_1 = validate_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions2Payload]
  }
  
  @scala.inline
  implicit class Typeofoptions2PayloadOps[Self <: Typeofoptions2Payload] (val x: Self) extends AnyVal {
    
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
    def setPreVarargs(value: `0`*): Self = this.set("pre", js.Array(value :_*))
    
    @scala.inline
    def setPre(value: js.Array[`0`]): Self = this.set("pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate_1(value: Typeofvalidate1): Self = this.set("validate_1", value.asInstanceOf[js.Any])
  }
}
