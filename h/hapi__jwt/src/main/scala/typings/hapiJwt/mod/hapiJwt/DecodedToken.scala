package typings.hapiJwt.mod.hapiJwt

import typings.hapiJwt.anon.Alg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecodedToken extends StObject {
  
  /**
    * An object that contain the header information.
    */
  var header: Alg
  
  /**
    *  An object containing the payload.
    */
  var payload: Any
  
  /**
    *  The signature string of the token.
    */
  var signature: String
}
object DecodedToken {
  
  inline def apply(header: Alg, payload: Any, signature: String): DecodedToken = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedToken]
  }
  
  extension [Self <: DecodedToken](x: Self) {
    
    inline def setHeader(value: Alg): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
