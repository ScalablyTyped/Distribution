package typings.googleapis.datamigrationV1Mod.datamigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSqlIpConfig extends StObject {
  
  /**
    * The list of external networks that are allowed to connect to the instance using the IP. See https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as 'slash' notation (e.g. `192.168.100.0/24`).
    */
  var authorizedNetworks: js.UndefOr[js.Array[SchemaSqlAclEntry]] = js.undefined
  
  /**
    * Whether the instance should be assigned an IPv4 address or not.
    */
  var enableIpv4: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
    */
  var privateNetwork: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether SSL connections over IP should be enforced or not.
    */
  var requireSsl: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSqlIpConfig {
  
  inline def apply(): SchemaSqlIpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlIpConfig]
  }
  
  extension [Self <: SchemaSqlIpConfig](x: Self) {
    
    inline def setAuthorizedNetworks(value: js.Array[SchemaSqlAclEntry]): Self = StObject.set(x, "authorizedNetworks", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedNetworksUndefined: Self = StObject.set(x, "authorizedNetworks", js.undefined)
    
    inline def setAuthorizedNetworksVarargs(value: SchemaSqlAclEntry*): Self = StObject.set(x, "authorizedNetworks", js.Array(value*))
    
    inline def setEnableIpv4(value: Boolean): Self = StObject.set(x, "enableIpv4", value.asInstanceOf[js.Any])
    
    inline def setEnableIpv4Null: Self = StObject.set(x, "enableIpv4", null)
    
    inline def setEnableIpv4Undefined: Self = StObject.set(x, "enableIpv4", js.undefined)
    
    inline def setPrivateNetwork(value: String): Self = StObject.set(x, "privateNetwork", value.asInstanceOf[js.Any])
    
    inline def setPrivateNetworkNull: Self = StObject.set(x, "privateNetwork", null)
    
    inline def setPrivateNetworkUndefined: Self = StObject.set(x, "privateNetwork", js.undefined)
    
    inline def setRequireSsl(value: Boolean): Self = StObject.set(x, "requireSsl", value.asInstanceOf[js.Any])
    
    inline def setRequireSslNull: Self = StObject.set(x, "requireSsl", null)
    
    inline def setRequireSslUndefined: Self = StObject.set(x, "requireSsl", js.undefined)
  }
}
