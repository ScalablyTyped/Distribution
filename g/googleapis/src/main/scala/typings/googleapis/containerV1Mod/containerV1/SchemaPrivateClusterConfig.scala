package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrivateClusterConfig extends StObject {
  
  /**
    * Whether the master's internal IP address is used as the cluster endpoint.
    */
  var enablePrivateEndpoint: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether nodes have internal IP addresses only. If enabled, all nodes are given only RFC 1918 private addresses and communicate with the master via private networking.
    */
  var enablePrivateNodes: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Controls master global access settings.
    */
  var masterGlobalAccessConfig: js.UndefOr[SchemaPrivateClusterMasterGlobalAccessConfig] = js.undefined
  
  /**
    * The IP range in CIDR notation to use for the hosted master network. This range will be used for assigning internal IP addresses to the master or set of masters, as well as the ILB VIP. This range must not overlap with any other ranges in use within the cluster's network.
    */
  var masterIpv4CidrBlock: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The peering name in the customer VPC used by this cluster.
    */
  var peeringName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The internal IP address of this cluster's master endpoint.
    */
  var privateEndpoint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The external IP address of this cluster's master endpoint.
    */
  var publicEndpoint: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrivateClusterConfig {
  
  inline def apply(): SchemaPrivateClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateClusterConfig]
  }
  
  extension [Self <: SchemaPrivateClusterConfig](x: Self) {
    
    inline def setEnablePrivateEndpoint(value: Boolean): Self = StObject.set(x, "enablePrivateEndpoint", value.asInstanceOf[js.Any])
    
    inline def setEnablePrivateEndpointNull: Self = StObject.set(x, "enablePrivateEndpoint", null)
    
    inline def setEnablePrivateEndpointUndefined: Self = StObject.set(x, "enablePrivateEndpoint", js.undefined)
    
    inline def setEnablePrivateNodes(value: Boolean): Self = StObject.set(x, "enablePrivateNodes", value.asInstanceOf[js.Any])
    
    inline def setEnablePrivateNodesNull: Self = StObject.set(x, "enablePrivateNodes", null)
    
    inline def setEnablePrivateNodesUndefined: Self = StObject.set(x, "enablePrivateNodes", js.undefined)
    
    inline def setMasterGlobalAccessConfig(value: SchemaPrivateClusterMasterGlobalAccessConfig): Self = StObject.set(x, "masterGlobalAccessConfig", value.asInstanceOf[js.Any])
    
    inline def setMasterGlobalAccessConfigUndefined: Self = StObject.set(x, "masterGlobalAccessConfig", js.undefined)
    
    inline def setMasterIpv4CidrBlock(value: String): Self = StObject.set(x, "masterIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setMasterIpv4CidrBlockNull: Self = StObject.set(x, "masterIpv4CidrBlock", null)
    
    inline def setMasterIpv4CidrBlockUndefined: Self = StObject.set(x, "masterIpv4CidrBlock", js.undefined)
    
    inline def setPeeringName(value: String): Self = StObject.set(x, "peeringName", value.asInstanceOf[js.Any])
    
    inline def setPeeringNameNull: Self = StObject.set(x, "peeringName", null)
    
    inline def setPeeringNameUndefined: Self = StObject.set(x, "peeringName", js.undefined)
    
    inline def setPrivateEndpoint(value: String): Self = StObject.set(x, "privateEndpoint", value.asInstanceOf[js.Any])
    
    inline def setPrivateEndpointNull: Self = StObject.set(x, "privateEndpoint", null)
    
    inline def setPrivateEndpointUndefined: Self = StObject.set(x, "privateEndpoint", js.undefined)
    
    inline def setPublicEndpoint(value: String): Self = StObject.set(x, "publicEndpoint", value.asInstanceOf[js.Any])
    
    inline def setPublicEndpointNull: Self = StObject.set(x, "publicEndpoint", null)
    
    inline def setPublicEndpointUndefined: Self = StObject.set(x, "publicEndpoint", js.undefined)
  }
}
