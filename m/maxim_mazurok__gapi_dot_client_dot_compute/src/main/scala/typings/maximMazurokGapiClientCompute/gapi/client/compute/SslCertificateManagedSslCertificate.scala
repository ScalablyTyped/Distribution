package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslCertificateManagedSslCertificate extends js.Object {
  
  /** [Output only] Detailed statuses of the domains specified for managed certificate resource. */
  var domainStatus: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.SslCertificateManagedSslCertificate with TopLevel[js.Any]
  ] = js.native
  
  /** The domains for which a managed SSL certificate will be generated. Currently only single-domain certs are supported. */
  var domains: js.UndefOr[js.Array[String]] = js.native
  
  /** [Output only] Status of the managed certificate resource. */
  var status: js.UndefOr[String] = js.native
}
object SslCertificateManagedSslCertificate {
  
  @scala.inline
  def apply(): SslCertificateManagedSslCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertificateManagedSslCertificate]
  }
  
  @scala.inline
  implicit class SslCertificateManagedSslCertificateOps[Self <: SslCertificateManagedSslCertificate] (val x: Self) extends AnyVal {
    
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
    def setDomainStatus(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.SslCertificateManagedSslCertificate with TopLevel[js.Any]
    ): Self = this.set("domainStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainStatus: Self = this.set("domainStatus", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: String*): Self = this.set("domains", js.Array(value :_*))
    
    @scala.inline
    def setDomains(value: js.Array[String]): Self = this.set("domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomains: Self = this.set("domains", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
