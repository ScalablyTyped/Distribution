package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateChains extends js.Object {
  
  /** Cavium certificate chain corresponding to the attestation. */
  var caviumCerts: js.UndefOr[js.Array[String]] = js.native
  
  /** Google card certificate chain corresponding to the attestation. */
  var googleCardCerts: js.UndefOr[js.Array[String]] = js.native
  
  /** Google partition certificate chain corresponding to the attestation. */
  var googlePartitionCerts: js.UndefOr[js.Array[String]] = js.native
}
object CertificateChains {
  
  @scala.inline
  def apply(): CertificateChains = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateChains]
  }
  
  @scala.inline
  implicit class CertificateChainsOps[Self <: CertificateChains] (val x: Self) extends AnyVal {
    
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
    def setCaviumCertsVarargs(value: String*): Self = this.set("caviumCerts", js.Array(value :_*))
    
    @scala.inline
    def setCaviumCerts(value: js.Array[String]): Self = this.set("caviumCerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaviumCerts: Self = this.set("caviumCerts", js.undefined)
    
    @scala.inline
    def setGoogleCardCertsVarargs(value: String*): Self = this.set("googleCardCerts", js.Array(value :_*))
    
    @scala.inline
    def setGoogleCardCerts(value: js.Array[String]): Self = this.set("googleCardCerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleCardCerts: Self = this.set("googleCardCerts", js.undefined)
    
    @scala.inline
    def setGooglePartitionCertsVarargs(value: String*): Self = this.set("googlePartitionCerts", js.Array(value :_*))
    
    @scala.inline
    def setGooglePartitionCerts(value: js.Array[String]): Self = this.set("googlePartitionCerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGooglePartitionCerts: Self = this.set("googlePartitionCerts", js.undefined)
  }
}
