package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyOperationAttestation extends js.Object {
  
  /** Output only. The certificate chains needed to validate the attestation */
  var certChains: js.UndefOr[CertificateChains] = js.native
  
  /** Output only. The attestation data provided by the HSM when the key operation was performed. */
  var content: js.UndefOr[String] = js.native
  
  /** Output only. The format of the attestation data. */
  var format: js.UndefOr[String] = js.native
}
object KeyOperationAttestation {
  
  @scala.inline
  def apply(): KeyOperationAttestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyOperationAttestation]
  }
  
  @scala.inline
  implicit class KeyOperationAttestationOps[Self <: KeyOperationAttestation] (val x: Self) extends AnyVal {
    
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
    def setCertChains(value: CertificateChains): Self = this.set("certChains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertChains: Self = this.set("certChains", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
}
