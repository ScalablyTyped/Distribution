package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslCertificateManagedSslCertificate extends StObject {
  
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
  implicit class SslCertificateManagedSslCertificateMutableBuilder[Self <: SslCertificateManagedSslCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainStatus(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.SslCertificateManagedSslCertificate with TopLevel[js.Any]
    ): Self = StObject.set(x, "domainStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainStatusUndefined: Self = StObject.set(x, "domainStatus", js.undefined)
    
    @scala.inline
    def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
