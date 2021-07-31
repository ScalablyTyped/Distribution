package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyOperationAttestation extends StObject {
  
  /** Output only. The certificate chains needed to validate the attestation */
  var certChains: js.UndefOr[CertificateChains] = js.undefined
  
  /** Output only. The attestation data provided by the HSM when the key operation was performed. */
  var content: js.UndefOr[String] = js.undefined
  
  /** Output only. The format of the attestation data. */
  var format: js.UndefOr[String] = js.undefined
}
object KeyOperationAttestation {
  
  @scala.inline
  def apply(): KeyOperationAttestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyOperationAttestation]
  }
  
  @scala.inline
  implicit class KeyOperationAttestationMutableBuilder[Self <: KeyOperationAttestation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertChains(value: CertificateChains): Self = StObject.set(x, "certChains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertChainsUndefined: Self = StObject.set(x, "certChains", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
