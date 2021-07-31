package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IP Management configuration.
  */
trait SchemaIpConfiguration extends StObject {
  
  /**
    * The list of external networks that are allowed to connect to the instance
    * using the IP. In CIDR notation, also known as &#39;slash&#39; notation
    * (e.g. 192.168.100.0/24).
    */
  var authorizedNetworks: js.UndefOr[js.Array[SchemaAclEntry]] = js.undefined
  
  /**
    * Whether the instance should be assigned an IP address or not.
    */
  var ipv4Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The resource link for the VPC network from which the Cloud SQL instance
    * is accessible for private IP. For example,
    * /projects/myProject/global/networks/default. This setting can be updated,
    * but it cannot be removed after it is set.
    */
  var privateNetwork: js.UndefOr[String] = js.undefined
  
  /**
    * Whether SSL connections over IP should be enforced or not.
    */
  var requireSsl: js.UndefOr[Boolean] = js.undefined
}
object SchemaIpConfiguration {
  
  @scala.inline
  def apply(): SchemaIpConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIpConfiguration]
  }
  
  @scala.inline
  implicit class SchemaIpConfigurationMutableBuilder[Self <: SchemaIpConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizedNetworks(value: js.Array[SchemaAclEntry]): Self = StObject.set(x, "authorizedNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedNetworksUndefined: Self = StObject.set(x, "authorizedNetworks", js.undefined)
    
    @scala.inline
    def setAuthorizedNetworksVarargs(value: SchemaAclEntry*): Self = StObject.set(x, "authorizedNetworks", js.Array(value :_*))
    
    @scala.inline
    def setIpv4Enabled(value: Boolean): Self = StObject.set(x, "ipv4Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4EnabledUndefined: Self = StObject.set(x, "ipv4Enabled", js.undefined)
    
    @scala.inline
    def setPrivateNetwork(value: String): Self = StObject.set(x, "privateNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateNetworkUndefined: Self = StObject.set(x, "privateNetwork", js.undefined)
    
    @scala.inline
    def setRequireSsl(value: Boolean): Self = StObject.set(x, "requireSsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireSslUndefined: Self = StObject.set(x, "requireSsl", js.undefined)
  }
}
