package typings.jose.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlattenedJWSInput extends StObject {
  
  /**
    * The "header" member MUST be present and contain the value JWS Unprotected Header when the JWS
    * Unprotected Header value is non- empty; otherwise, it MUST be absent. This value is represented
    * as an unencoded JSON object, rather than as a string. These Header Parameter values are not
    * integrity protected.
    */
  var header: js.UndefOr[JWSHeaderParameters] = js.undefined
  
  /**
    * The "payload" member MUST be present and contain the value BASE64URL(JWS Payload). When RFC7797
    * "b64": false is used the value passed may also be a Uint8Array.
    */
  var payload: String | js.typedarray.Uint8Array
  
  /**
    * The "protected" member MUST be present and contain the value BASE64URL(UTF8(JWS Protected
    * Header)) when the JWS Protected Header value is non-empty; otherwise, it MUST be absent. These
    * Header Parameter values are integrity protected.
    */
  var `protected`: js.UndefOr[String] = js.undefined
  
  /** The "signature" member MUST be present and contain the value BASE64URL(JWS Signature). */
  var signature: String
}
object FlattenedJWSInput {
  
  inline def apply(payload: String | js.typedarray.Uint8Array, signature: String): FlattenedJWSInput = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenedJWSInput]
  }
  
  extension [Self <: FlattenedJWSInput](x: Self) {
    
    inline def setHeader(value: JWSHeaderParameters): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setPayload(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setProtected(value: String): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
