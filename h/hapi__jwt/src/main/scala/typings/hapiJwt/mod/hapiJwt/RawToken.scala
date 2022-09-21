package typings.hapiJwt.mod.hapiJwt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawToken extends StObject {
  
  /**
    *  The header of the token.
    */
  var header: String
  
  /**
    *  The payload of the token.
    */
  var payload: String
  
  /**
    *  The signature of the token.
    */
  var signature: String
}
object RawToken {
  
  inline def apply(header: String, payload: String, signature: String): RawToken = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawToken]
  }
  
  extension [Self <: RawToken](x: Self) {
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
