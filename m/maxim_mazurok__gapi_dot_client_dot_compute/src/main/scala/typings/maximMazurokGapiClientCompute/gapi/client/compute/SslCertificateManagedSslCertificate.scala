package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslCertificateManagedSslCertificate extends StObject {
  
  /** [Output only] Detailed statuses of the domains specified for managed certificate resource. */
  var domainStatus: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.SslCertificateManagedSslCertificate & TopLevel[js.Any]
  ] = js.undefined
  
  /** The domains for which a managed SSL certificate will be generated. Currently only single-domain certs are supported. */
  var domains: js.UndefOr[js.Array[String]] = js.undefined
  
  /** [Output only] Status of the managed certificate resource. */
  var status: js.UndefOr[String] = js.undefined
}
object SslCertificateManagedSslCertificate {
  
  inline def apply(): SslCertificateManagedSslCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertificateManagedSslCertificate]
  }
  
  extension [Self <: SslCertificateManagedSslCertificate](x: Self) {
    
    inline def setDomainStatus(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.SslCertificateManagedSslCertificate & TopLevel[js.Any]
    ): Self = StObject.set(x, "domainStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainStatusUndefined: Self = StObject.set(x, "domainStatus", js.undefined)
    
    inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value :_*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
