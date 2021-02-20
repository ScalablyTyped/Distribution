package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions2Payload extends StObject {
  
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
  implicit class Typeofoptions2PayloadMutableBuilder[Self <: Typeofoptions2Payload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Typeofpayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPre(value: js.Array[`0`]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreVarargs(value: `0`*): Self = StObject.set(x, "pre", js.Array(value :_*))
    
    @scala.inline
    def setValidate_1(value: Typeofvalidate1): Self = StObject.set(x, "validate_1", value.asInstanceOf[js.Any])
  }
}
