package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DNSConfig extends StObject {
  
  /** cluster_dns indicates which in-cluster DNS provider should be used. */
  var clusterDns: js.UndefOr[String] = js.undefined
  
  /** cluster_dns_domain is the suffix used for all cluster service records. */
  var clusterDnsDomain: js.UndefOr[String] = js.undefined
  
  /** cluster_dns_scope indicates the scope of access to cluster DNS records. */
  var clusterDnsScope: js.UndefOr[String] = js.undefined
}
object DNSConfig {
  
  inline def apply(): DNSConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DNSConfig]
  }
  
  extension [Self <: DNSConfig](x: Self) {
    
    inline def setClusterDns(value: String): Self = StObject.set(x, "clusterDns", value.asInstanceOf[js.Any])
    
    inline def setClusterDnsDomain(value: String): Self = StObject.set(x, "clusterDnsDomain", value.asInstanceOf[js.Any])
    
    inline def setClusterDnsDomainUndefined: Self = StObject.set(x, "clusterDnsDomain", js.undefined)
    
    inline def setClusterDnsScope(value: String): Self = StObject.set(x, "clusterDnsScope", value.asInstanceOf[js.Any])
    
    inline def setClusterDnsScopeUndefined: Self = StObject.set(x, "clusterDnsScope", js.undefined)
    
    inline def setClusterDnsUndefined: Self = StObject.set(x, "clusterDns", js.undefined)
  }
}
