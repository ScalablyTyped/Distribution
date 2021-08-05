package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions2Payload extends StObject {
  
  val payload: Typeofpayload
  
  val pre: js.Array[`0`]
  
  val validate_1: Typeofvalidate1
}
object Typeofoptions2Payload {
  
  inline def apply(payload: Typeofpayload, pre: js.Array[`0`], validate_1: Typeofvalidate1): Typeofoptions2Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], validate_1 = validate_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions2Payload]
  }
  
  extension [Self <: Typeofoptions2Payload](x: Self) {
    
    inline def setPayload(value: Typeofpayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPre(value: js.Array[`0`]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    inline def setPreVarargs(value: `0`*): Self = StObject.set(x, "pre", js.Array(value :_*))
    
    inline def setValidate_1(value: Typeofvalidate1): Self = StObject.set(x, "validate_1", value.asInstanceOf[js.Any])
  }
}
