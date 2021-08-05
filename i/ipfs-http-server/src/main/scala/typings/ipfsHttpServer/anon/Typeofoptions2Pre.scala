package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions2Pre extends StObject {
  
  val payload: Typeofpayload
  
  val pre: js.Array[AssignString]
  
  val validate_1: Typeofvalidate1
}
object Typeofoptions2Pre {
  
  inline def apply(payload: Typeofpayload, pre: js.Array[AssignString], validate_1: Typeofvalidate1): Typeofoptions2Pre = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], validate_1 = validate_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions2Pre]
  }
  
  extension [Self <: Typeofoptions2Pre](x: Self) {
    
    inline def setPayload(value: Typeofpayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPre(value: js.Array[AssignString]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    inline def setPreVarargs(value: AssignString*): Self = StObject.set(x, "pre", js.Array(value :_*))
    
    inline def setValidate_1(value: Typeofvalidate1): Self = StObject.set(x, "validate_1", value.asInstanceOf[js.Any])
  }
}
