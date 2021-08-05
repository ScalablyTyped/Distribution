package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions2Payload1 extends StObject {
  
  val payload_1: Typeofpayload1
  
  val pre: js.Array[Assign]
  
  val validate_1: Typeofvalidate1
}
object Typeofoptions2Payload1 {
  
  inline def apply(payload_1: Typeofpayload1, pre: js.Array[Assign], validate_1: Typeofvalidate1): Typeofoptions2Payload1 = {
    val __obj = js.Dynamic.literal(payload_1 = payload_1.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], validate_1 = validate_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions2Payload1]
  }
  
  extension [Self <: Typeofoptions2Payload1](x: Self) {
    
    inline def setPayload_1(value: Typeofpayload1): Self = StObject.set(x, "payload_1", value.asInstanceOf[js.Any])
    
    inline def setPre(value: js.Array[Assign]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    inline def setPreVarargs(value: Assign*): Self = StObject.set(x, "pre", js.Array(value :_*))
    
    inline def setValidate_1(value: Typeofvalidate1): Self = StObject.set(x, "validate_1", value.asInstanceOf[js.Any])
  }
}
