package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions6Payload1 extends StObject {
  
  val payload_1: Typeofpayload1
  
  val pre_1: js.Array[AssignMethod]
  
  val validate_3: Typeofvalidate3
}
object Typeofoptions6Payload1 {
  
  inline def apply(payload_1: Typeofpayload1, pre_1: js.Array[AssignMethod], validate_3: Typeofvalidate3): Typeofoptions6Payload1 = {
    val __obj = js.Dynamic.literal(payload_1 = payload_1.asInstanceOf[js.Any], pre_1 = pre_1.asInstanceOf[js.Any], validate_3 = validate_3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions6Payload1]
  }
  
  extension [Self <: Typeofoptions6Payload1](x: Self) {
    
    inline def setPayload_1(value: Typeofpayload1): Self = StObject.set(x, "payload_1", value.asInstanceOf[js.Any])
    
    inline def setPre_1(value: js.Array[AssignMethod]): Self = StObject.set(x, "pre_1", value.asInstanceOf[js.Any])
    
    inline def setPre_1Varargs(value: AssignMethod*): Self = StObject.set(x, "pre_1", js.Array(value :_*))
    
    inline def setValidate_3(value: Typeofvalidate3): Self = StObject.set(x, "validate_3", value.asInstanceOf[js.Any])
  }
}
