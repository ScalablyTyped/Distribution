package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttestationOccurrence extends js.Object {
  
  /**
    * One or more JWTs encoding a self-contained attestation. Each JWT encodes the payload that it verifies within the JWT itself. Verifier implementation SHOULD ignore the
    * `serialized_payload` field when verifying these JWTs. If only JWTs are present on this AttestationOccurrence, then the `serialized_payload` SHOULD be left empty. Each JWT SHOULD
    * encode a claim specific to the `resource_uri` of this Occurrence, but this is not validated by Grafeas metadata API implementations. The JWT itself is opaque to Grafeas.
    */
  var jwts: js.UndefOr[js.Array[Jwt]] = js.native
  
  /** Required. The serialized payload that is verified by one or more `signatures`. */
  var serializedPayload: js.UndefOr[String] = js.native
  
  /**
    * One or more signatures over `serialized_payload`. Verifier implementations should consider this attestation message verified if at least one `signature` verifies
    * `serialized_payload`. See `Signature` in common.proto for more details on signature structure and verification.
    */
  var signatures: js.UndefOr[js.Array[Signature]] = js.native
}
object AttestationOccurrence {
  
  @scala.inline
  def apply(): AttestationOccurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttestationOccurrence]
  }
  
  @scala.inline
  implicit class AttestationOccurrenceOps[Self <: AttestationOccurrence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJwtsVarargs(value: Jwt*): Self = this.set("jwts", js.Array(value :_*))
    
    @scala.inline
    def setJwts(value: js.Array[Jwt]): Self = this.set("jwts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwts: Self = this.set("jwts", js.undefined)
    
    @scala.inline
    def setSerializedPayload(value: String): Self = this.set("serializedPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializedPayload: Self = this.set("serializedPayload", js.undefined)
    
    @scala.inline
    def setSignaturesVarargs(value: Signature*): Self = this.set("signatures", js.Array(value :_*))
    
    @scala.inline
    def setSignatures(value: js.Array[Signature]): Self = this.set("signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatures: Self = this.set("signatures", js.undefined)
  }
}
