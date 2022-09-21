package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDNSConfig extends StObject {
  
  /**
    * cluster_dns indicates which in-cluster DNS provider should be used.
    */
  var clusterDns: js.UndefOr[String | Null] = js.undefined
  
  /**
    * cluster_dns_domain is the suffix used for all cluster service records.
    */
  var clusterDnsDomain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * cluster_dns_scope indicates the scope of access to cluster DNS records.
    */
  var clusterDnsScope: js.UndefOr[String | Null] = js.undefined
}
object SchemaDNSConfig {
  
  inline def apply(): SchemaDNSConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDNSConfig]
  }
  
  extension [Self <: SchemaDNSConfig](x: Self) {
    
    inline def setClusterDns(value: String): Self = StObject.set(x, "clusterDns", value.asInstanceOf[js.Any])
    
    inline def setClusterDnsDomain(value: String): Self = StObject.set(x, "clusterDnsDomain", value.asInstanceOf[js.Any])
    
    inline def setClusterDnsDomainNull: Self = StObject.set(x, "clusterDnsDomain", null)
    
    inline def setClusterDnsDomainUndefined: Self = StObject.set(x, "clusterDnsDomain", js.undefined)
    
    inline def setClusterDnsNull: Self = StObject.set(x, "clusterDns", null)
    
    inline def setClusterDnsScope(value: String): Self = StObject.set(x, "clusterDnsScope", value.asInstanceOf[js.Any])
    
    inline def setClusterDnsScopeNull: Self = StObject.set(x, "clusterDnsScope", null)
    
    inline def setClusterDnsScopeUndefined: Self = StObject.set(x, "clusterDnsScope", js.undefined)
    
    inline def setClusterDnsUndefined: Self = StObject.set(x, "clusterDns", js.undefined)
  }
}
