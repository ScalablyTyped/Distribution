package typings.jose.distTypesTypesMod

import typings.jose.anon.OmitFlattenedJWSInputpayl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralJWSInput extends StObject {
  
  /**
    * The "payload" member MUST be present and contain the value BASE64URL(JWS Payload). When when
    * JWS Unencoded Payload ({@link https://www.rfc-editor.org/rfc/rfc7797 RFC7797}) "b64": false is
    * used the value passed may also be a Uint8Array.
    */
  var payload: String | js.typedarray.Uint8Array
  
  /**
    * The "signatures" member value MUST be an array of JSON objects. Each object represents a
    * signature or MAC over the JWS Payload and the JWS Protected Header.
    */
  var signatures: js.Array[OmitFlattenedJWSInputpayl]
}
object GeneralJWSInput {
  
  inline def apply(payload: String | js.typedarray.Uint8Array, signatures: js.Array[OmitFlattenedJWSInputpayl]): GeneralJWSInput = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralJWSInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneralJWSInput] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setSignatures(value: js.Array[OmitFlattenedJWSInputpayl]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesVarargs(value: OmitFlattenedJWSInputpayl*): Self = StObject.set(x, "signatures", js.Array(value*))
  }
}
