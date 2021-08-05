package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions4Validate2 extends StObject {
  
  val payload: TypeofpayloadMaxBytes
  
  val validate_2: Typeofvalidate2
}
object Typeofoptions4Validate2 {
  
  inline def apply(payload: TypeofpayloadMaxBytes, validate_2: Typeofvalidate2): Typeofoptions4Validate2 = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], validate_2 = validate_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions4Validate2]
  }
  
  extension [Self <: Typeofoptions4Validate2](x: Self) {
    
    inline def setPayload(value: TypeofpayloadMaxBytes): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setValidate_2(value: Typeofvalidate2): Self = StObject.set(x, "validate_2", value.asInstanceOf[js.Any])
  }
}
