package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttestationOccurrence extends StObject {
  
  /**
    * One or more JWTs encoding a self-contained attestation. Each JWT encodes the payload that it verifies within the JWT itself. Verifier implementation SHOULD ignore the
    * `serialized_payload` field when verifying these JWTs. If only JWTs are present on this AttestationOccurrence, then the `serialized_payload` SHOULD be left empty. Each JWT SHOULD
    * encode a claim specific to the `resource_uri` of this Occurrence, but this is not validated by Grafeas metadata API implementations. The JWT itself is opaque to Grafeas.
    */
  var jwts: js.UndefOr[js.Array[Jwt]] = js.undefined
  
  /** Required. The serialized payload that is verified by one or more `signatures`. */
  var serializedPayload: js.UndefOr[String] = js.undefined
  
  /**
    * One or more signatures over `serialized_payload`. Verifier implementations should consider this attestation message verified if at least one `signature` verifies
    * `serialized_payload`. See `Signature` in common.proto for more details on signature structure and verification.
    */
  var signatures: js.UndefOr[js.Array[Signature]] = js.undefined
}
object AttestationOccurrence {
  
  inline def apply(): AttestationOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttestationOccurrence]
  }
  
  extension [Self <: AttestationOccurrence](x: Self) {
    
    inline def setJwts(value: js.Array[Jwt]): Self = StObject.set(x, "jwts", value.asInstanceOf[js.Any])
    
    inline def setJwtsUndefined: Self = StObject.set(x, "jwts", js.undefined)
    
    inline def setJwtsVarargs(value: Jwt*): Self = StObject.set(x, "jwts", js.Array(value*))
    
    inline def setSerializedPayload(value: String): Self = StObject.set(x, "serializedPayload", value.asInstanceOf[js.Any])
    
    inline def setSerializedPayloadUndefined: Self = StObject.set(x, "serializedPayload", js.undefined)
    
    inline def setSignatures(value: js.Array[Signature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
    
    inline def setSignaturesVarargs(value: Signature*): Self = StObject.set(x, "signatures", js.Array(value*))
  }
}
