package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions4Validate2 extends js.Object {
  
  val payload: TypeofpayloadMaxBytes = js.native
  
  val validate_2: Typeofvalidate2 = js.native
}
object Typeofoptions4Validate2 {
  
  @scala.inline
  def apply(payload: TypeofpayloadMaxBytes, validate_2: Typeofvalidate2): Typeofoptions4Validate2 = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], validate_2 = validate_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions4Validate2]
  }
  
  @scala.inline
  implicit class Typeofoptions4Validate2Ops[Self <: Typeofoptions4Validate2] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: TypeofpayloadMaxBytes): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate_2(value: Typeofvalidate2): Self = this.set("validate_2", value.asInstanceOf[js.Any])
  }
}
