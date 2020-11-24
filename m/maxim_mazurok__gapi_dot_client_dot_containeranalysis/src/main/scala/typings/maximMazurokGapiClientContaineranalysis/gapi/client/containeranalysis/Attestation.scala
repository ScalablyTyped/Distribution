package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attestation extends js.Object {
  
  var genericSignedAttestation: js.UndefOr[GenericSignedAttestation] = js.native
  
  /** A PGP signed attestation. */
  var pgpSignedAttestation: js.UndefOr[PgpSignedAttestation] = js.native
}
object Attestation {
  
  @scala.inline
  def apply(): Attestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attestation]
  }
  
  @scala.inline
  implicit class AttestationOps[Self <: Attestation] (val x: Self) extends AnyVal {
    
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
    def setGenericSignedAttestation(value: GenericSignedAttestation): Self = this.set("genericSignedAttestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenericSignedAttestation: Self = this.set("genericSignedAttestation", js.undefined)
    
    @scala.inline
    def setPgpSignedAttestation(value: PgpSignedAttestation): Self = this.set("pgpSignedAttestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePgpSignedAttestation: Self = this.set("pgpSignedAttestation", js.undefined)
  }
}
