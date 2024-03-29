package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route extends StObject {
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** An optional description of this resource. Provide this field when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported. */
  var destRange: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Type of this resource. Always compute#routes for Route resources. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last
    * character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Fully-qualified URL of the network that this route applies to. */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/
    * project/global/gateways/default-internet-gateway
    */
  var nextHopGateway: js.UndefOr[String] = js.undefined
  
  /**
    * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all
    * valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
    */
  var nextHopIlb: js.UndefOr[String] = js.undefined
  
  /**
    * The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example:
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
    */
  var nextHopInstance: js.UndefOr[String] = js.undefined
  
  /** The network IP address of an instance that should handle matching packets. Only IPv4 is supported. */
  var nextHopIp: js.UndefOr[String] = js.undefined
  
  /** The URL of the local network if it should handle matching packets. */
  var nextHopNetwork: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The network peering name that should handle matching packets, which should conform to RFC1035. */
  var nextHopPeering: js.UndefOr[String] = js.undefined
  
  /** The URL to a VpnTunnel that should handle matching packets. */
  var nextHopVpnTunnel: js.UndefOr[String] = js.undefined
  
  /**
    * The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal
    * prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] Server-defined fully-qualified URL for this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** A list of instance tags to which this route applies. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /** [Output Only] If potential misconfigurations are detected for this route, this field will be populated with warning messages. */
  var warnings: js.UndefOr[js.Array[Code]] = js.undefined
}
object Route {
  
  inline def apply(): Route = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestRange(value: String): Self = StObject.set(x, "destRange", value.asInstanceOf[js.Any])
    
    inline def setDestRangeUndefined: Self = StObject.set(x, "destRange", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNextHopGateway(value: String): Self = StObject.set(x, "nextHopGateway", value.asInstanceOf[js.Any])
    
    inline def setNextHopGatewayUndefined: Self = StObject.set(x, "nextHopGateway", js.undefined)
    
    inline def setNextHopIlb(value: String): Self = StObject.set(x, "nextHopIlb", value.asInstanceOf[js.Any])
    
    inline def setNextHopIlbUndefined: Self = StObject.set(x, "nextHopIlb", js.undefined)
    
    inline def setNextHopInstance(value: String): Self = StObject.set(x, "nextHopInstance", value.asInstanceOf[js.Any])
    
    inline def setNextHopInstanceUndefined: Self = StObject.set(x, "nextHopInstance", js.undefined)
    
    inline def setNextHopIp(value: String): Self = StObject.set(x, "nextHopIp", value.asInstanceOf[js.Any])
    
    inline def setNextHopIpUndefined: Self = StObject.set(x, "nextHopIp", js.undefined)
    
    inline def setNextHopNetwork(value: String): Self = StObject.set(x, "nextHopNetwork", value.asInstanceOf[js.Any])
    
    inline def setNextHopNetworkUndefined: Self = StObject.set(x, "nextHopNetwork", js.undefined)
    
    inline def setNextHopPeering(value: String): Self = StObject.set(x, "nextHopPeering", value.asInstanceOf[js.Any])
    
    inline def setNextHopPeeringUndefined: Self = StObject.set(x, "nextHopPeering", js.undefined)
    
    inline def setNextHopVpnTunnel(value: String): Self = StObject.set(x, "nextHopVpnTunnel", value.asInstanceOf[js.Any])
    
    inline def setNextHopVpnTunnelUndefined: Self = StObject.set(x, "nextHopVpnTunnel", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setWarnings(value: js.Array[Code]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Code*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
