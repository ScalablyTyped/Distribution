package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options for private clusters.
  */
trait SchemaPrivateClusterConfig extends StObject {
  
  /**
    * Whether the master&#39;s internal IP address is used as the cluster
    * endpoint.
    */
  var enablePrivateEndpoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether nodes have internal IP addresses only. If enabled, all nodes are
    * given only RFC 1918 private addresses and communicate with the master via
    * private networking.
    */
  var enablePrivateNodes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IP range in CIDR notation to use for the hosted master network. This
    * range will be used for assigning internal IP addresses to the master or
    * set of masters, as well as the ILB VIP. This range must not overlap with
    * any other ranges in use within the cluster&#39;s network.
    */
  var masterIpv4CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The internal IP address of this cluster&#39;s master
    * endpoint.
    */
  var privateEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The external IP address of this cluster&#39;s master
    * endpoint.
    */
  var publicEndpoint: js.UndefOr[String] = js.undefined
}
object SchemaPrivateClusterConfig {
  
  @scala.inline
  def apply(): SchemaPrivateClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateClusterConfig]
  }
  
  @scala.inline
  implicit class SchemaPrivateClusterConfigMutableBuilder[Self <: SchemaPrivateClusterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnablePrivateEndpoint(value: Boolean): Self = StObject.set(x, "enablePrivateEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePrivateEndpointUndefined: Self = StObject.set(x, "enablePrivateEndpoint", js.undefined)
    
    @scala.inline
    def setEnablePrivateNodes(value: Boolean): Self = StObject.set(x, "enablePrivateNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePrivateNodesUndefined: Self = StObject.set(x, "enablePrivateNodes", js.undefined)
    
    @scala.inline
    def setMasterIpv4CidrBlock(value: String): Self = StObject.set(x, "masterIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterIpv4CidrBlockUndefined: Self = StObject.set(x, "masterIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setPrivateEndpoint(value: String): Self = StObject.set(x, "privateEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateEndpointUndefined: Self = StObject.set(x, "privateEndpoint", js.undefined)
    
    @scala.inline
    def setPublicEndpoint(value: String): Self = StObject.set(x, "publicEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicEndpointUndefined: Self = StObject.set(x, "publicEndpoint", js.undefined)
  }
}
