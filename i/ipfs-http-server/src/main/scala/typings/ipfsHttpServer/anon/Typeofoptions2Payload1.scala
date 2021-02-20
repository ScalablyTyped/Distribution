package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions2Payload1 extends StObject {
  
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
  implicit class Typeofoptions2Payload1MutableBuilder[Self <: Typeofoptions2Payload1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload_1(value: Typeofpayload1): Self = StObject.set(x, "payload_1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPre(value: js.Array[Assign]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreVarargs(value: Assign*): Self = StObject.set(x, "pre", js.Array(value :_*))
    
    @scala.inline
    def setValidate_1(value: Typeofvalidate1): Self = StObject.set(x, "validate_1", value.asInstanceOf[js.Any])
  }
}
