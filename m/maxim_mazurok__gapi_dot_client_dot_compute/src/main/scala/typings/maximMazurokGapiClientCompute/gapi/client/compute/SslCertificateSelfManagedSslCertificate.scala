package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslCertificateSelfManagedSslCertificate extends js.Object {
  
  /** A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert. */
  var certificate: js.UndefOr[String] = js.native
  
  /** A write-only private key in PEM format. Only insert requests will include this field. */
  var privateKey: js.UndefOr[String] = js.native
}
object SslCertificateSelfManagedSslCertificate {
  
  @scala.inline
  def apply(): SslCertificateSelfManagedSslCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertificateSelfManagedSslCertificate]
  }
  
  @scala.inline
  implicit class SslCertificateSelfManagedSslCertificateOps[Self <: SslCertificateSelfManagedSslCertificate] (val x: Self) extends AnyVal {
    
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
    def setCertificate(value: String): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
  }
}
