package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserOwnedGrafeasNote extends StObject {
  
  /**
    * Output only. This field will contain the service account email address that this Attestor will use as the principal when querying Container Analysis. Attestor administrators must
    * grant this service account the IAM role needed to read attestations from the note_reference in Container Analysis (`containeranalysis.notes.occurrences.viewer`). This email address
    * is fixed for the lifetime of the Attestor, but callers should not make any other assumptions about the service account email; future versions may use an email based on a different
    * naming pattern.
    */
  var delegationServiceAccountEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The Grafeas resource name of a Attestation.Authority Note, created by the user, in the format: `projects/ *‍/notes/ *`. This field may not be updated. An attestation by this
    * attestor is stored as a Grafeas Attestation.Authority Occurrence that names a container image and that links to this Note. Grafeas is an external dependency.
    */
  var noteReference: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Public keys that verify attestations signed by this attestor. This field may be updated. If this field is non-empty, one of the specified public keys must verify that an
    * attestation was signed by this attestor for the image specified in the admission request. If this field is empty, this attestor always returns that no valid attestations exist.
    */
  var publicKeys: js.UndefOr[js.Array[AttestorPublicKey]] = js.undefined
}
object UserOwnedGrafeasNote {
  
  inline def apply(): UserOwnedGrafeasNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserOwnedGrafeasNote]
  }
  
  extension [Self <: UserOwnedGrafeasNote](x: Self) {
    
    inline def setDelegationServiceAccountEmail(value: String): Self = StObject.set(x, "delegationServiceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setDelegationServiceAccountEmailUndefined: Self = StObject.set(x, "delegationServiceAccountEmail", js.undefined)
    
    inline def setNoteReference(value: String): Self = StObject.set(x, "noteReference", value.asInstanceOf[js.Any])
    
    inline def setNoteReferenceUndefined: Self = StObject.set(x, "noteReference", js.undefined)
    
    inline def setPublicKeys(value: js.Array[AttestorPublicKey]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    
    inline def setPublicKeysUndefined: Self = StObject.set(x, "publicKeys", js.undefined)
    
    inline def setPublicKeysVarargs(value: AttestorPublicKey*): Self = StObject.set(x, "publicKeys", js.Array(value*))
  }
}
