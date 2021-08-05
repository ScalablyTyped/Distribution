package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions14 extends StObject {
  
  val payload_2: Typeofpayload2
  
  val pre_2: js.Array[AssignStringMethod]
  
  val validate_7: Typeofvalidate7
}
object Typeofoptions14 {
  
  inline def apply(payload_2: Typeofpayload2, pre_2: js.Array[AssignStringMethod], validate_7: Typeofvalidate7): Typeofoptions14 = {
    val __obj = js.Dynamic.literal(payload_2 = payload_2.asInstanceOf[js.Any], pre_2 = pre_2.asInstanceOf[js.Any], validate_7 = validate_7.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions14]
  }
  
  extension [Self <: Typeofoptions14](x: Self) {
    
    inline def setPayload_2(value: Typeofpayload2): Self = StObject.set(x, "payload_2", value.asInstanceOf[js.Any])
    
    inline def setPre_2(value: js.Array[AssignStringMethod]): Self = StObject.set(x, "pre_2", value.asInstanceOf[js.Any])
    
    inline def setPre_2Varargs(value: AssignStringMethod*): Self = StObject.set(x, "pre_2", js.Array(value :_*))
    
    inline def setValidate_7(value: Typeofvalidate7): Self = StObject.set(x, "validate_7", value.asInstanceOf[js.Any])
  }
}
