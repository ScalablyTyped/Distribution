package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslCertificateManagedSslCertificate extends StObject {
  
  /** [Output only] Detailed statuses of the domains specified for managed certificate resource. */
  var domainStatus: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * The domains for which a managed SSL certificate will be generated. Each Google-managed SSL certificate supports up to the [maximum number of domains per Google-managed SSL
    * certificate](/load-balancing/docs/quotas#ssl_certificates).
    */
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
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "domainStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainStatusUndefined: Self = StObject.set(x, "domainStatus", js.undefined)
    
    inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
