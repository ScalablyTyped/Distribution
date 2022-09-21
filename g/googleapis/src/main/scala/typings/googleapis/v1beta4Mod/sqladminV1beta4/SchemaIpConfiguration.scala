package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIpConfiguration extends StObject {
  
  /**
    * The name of the allocated ip range for the private ip CloudSQL instance. For example: "google-managed-services-default". If set, the instance ip will be created in the allocated range. The range name must comply with [RFC 1035](https://tools.ietf.org/html/rfc1035). Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?.`
    */
  var allocatedIpRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of external networks that are allowed to connect to the instance using the IP. In 'CIDR' notation, also known as 'slash' notation (for example: `157.197.200.0/24`).
    */
  var authorizedNetworks: js.UndefOr[js.Array[SchemaAclEntry]] = js.undefined
  
  /**
    * Whether the instance is assigned a public IP address or not.
    */
  var ipv4Enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `/projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
    */
  var privateNetwork: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether SSL connections over IP are enforced or not.
    */
  var requireSsl: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaIpConfiguration {
  
  inline def apply(): SchemaIpConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIpConfiguration]
  }
  
  extension [Self <: SchemaIpConfiguration](x: Self) {
    
    inline def setAllocatedIpRange(value: String): Self = StObject.set(x, "allocatedIpRange", value.asInstanceOf[js.Any])
    
    inline def setAllocatedIpRangeNull: Self = StObject.set(x, "allocatedIpRange", null)
    
    inline def setAllocatedIpRangeUndefined: Self = StObject.set(x, "allocatedIpRange", js.undefined)
    
    inline def setAuthorizedNetworks(value: js.Array[SchemaAclEntry]): Self = StObject.set(x, "authorizedNetworks", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedNetworksUndefined: Self = StObject.set(x, "authorizedNetworks", js.undefined)
    
    inline def setAuthorizedNetworksVarargs(value: SchemaAclEntry*): Self = StObject.set(x, "authorizedNetworks", js.Array(value*))
    
    inline def setIpv4Enabled(value: Boolean): Self = StObject.set(x, "ipv4Enabled", value.asInstanceOf[js.Any])
    
    inline def setIpv4EnabledNull: Self = StObject.set(x, "ipv4Enabled", null)
    
    inline def setIpv4EnabledUndefined: Self = StObject.set(x, "ipv4Enabled", js.undefined)
    
    inline def setPrivateNetwork(value: String): Self = StObject.set(x, "privateNetwork", value.asInstanceOf[js.Any])
    
    inline def setPrivateNetworkNull: Self = StObject.set(x, "privateNetwork", null)
    
    inline def setPrivateNetworkUndefined: Self = StObject.set(x, "privateNetwork", js.undefined)
    
    inline def setRequireSsl(value: Boolean): Self = StObject.set(x, "requireSsl", value.asInstanceOf[js.Any])
    
    inline def setRequireSslNull: Self = StObject.set(x, "requireSsl", null)
    
    inline def setRequireSslUndefined: Self = StObject.set(x, "requireSsl", js.undefined)
  }
}
