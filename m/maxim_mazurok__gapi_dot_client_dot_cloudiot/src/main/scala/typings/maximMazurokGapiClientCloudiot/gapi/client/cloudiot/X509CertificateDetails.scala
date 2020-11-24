package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X509CertificateDetails extends js.Object {
  
  /** The time the certificate becomes invalid. */
  var expiryTime: js.UndefOr[String] = js.native
  
  /** The entity that signed the certificate. */
  var issuer: js.UndefOr[String] = js.native
  
  /** The type of public key in the certificate. */
  var publicKeyType: js.UndefOr[String] = js.native
  
  /** The algorithm used to sign the certificate. */
  var signatureAlgorithm: js.UndefOr[String] = js.native
  
  /** The time the certificate becomes valid. */
  var startTime: js.UndefOr[String] = js.native
  
  /** The entity the certificate and public key belong to. */
  var subject: js.UndefOr[String] = js.native
}
object X509CertificateDetails {
  
  @scala.inline
  def apply(): X509CertificateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X509CertificateDetails]
  }
  
  @scala.inline
  implicit class X509CertificateDetailsOps[Self <: X509CertificateDetails] (val x: Self) extends AnyVal {
    
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
    def setExpiryTime(value: String): Self = this.set("expiryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiryTime: Self = this.set("expiryTime", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    
    @scala.inline
    def setPublicKeyType(value: String): Self = this.set("publicKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKeyType: Self = this.set("publicKeyType", js.undefined)
    
    @scala.inline
    def setSignatureAlgorithm(value: String): Self = this.set("signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureAlgorithm: Self = this.set("signatureAlgorithm", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
