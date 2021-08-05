package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterBgpPeer extends StObject {
  
  /** User-specified flag to indicate which mode to use for advertisement. */
  var advertiseMode: js.UndefOr[String] = js.undefined
  
  /**
    * User-specified list of prefix groups to advertise in custom mode, which can take one of the following options:
    * - ALL_SUBNETS: Advertises all available subnets, including peer VPC subnets.
    * - ALL_VPC_SUBNETS: Advertises the router's own VPC subnets.
    * - ALL_PEER_VPC_SUBNETS: Advertises peer subnets of the router's VPC network. Note that this field can only be populated if advertise_mode is CUSTOM and overrides the list defined
    * for the router (in the "bgp" message). These groups are advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
    */
  var advertisedGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router
    * (in the "bgp" message). These IP ranges are advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
    */
  var advertisedIpRanges: js.UndefOr[js.Array[RouterAdvertisedIpRange]] = js.undefined
  
  /** The priority of routes advertised to this BGP peer. Where there is more than one matching route of maximum length, the routes with the lowest priority value win. */
  var advertisedRoutePriority: js.UndefOr[Double] = js.undefined
  
  /** Name of the interface the BGP peer is associated with. */
  var interfaceName: js.UndefOr[String] = js.undefined
  
  /** IP address of the interface inside Google Cloud Platform. Only IPv4 is supported. */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The resource that configures and manages this BGP peer.
    * - MANAGED_BY_USER is the default value and can be managed by you or other users
    * - MANAGED_BY_ATTACHMENT is a BGP peer that is configured and managed by Cloud Interconnect, specifically by an InterconnectAttachment of type PARTNER. Google automatically creates,
    * updates, and deletes this type of BGP peer when the PARTNER InterconnectAttachment is created, updated, or deleted.
    */
  var managementType: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this BGP peer. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression
    * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last
    * character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value. */
  var peerAsn: js.UndefOr[Double] = js.undefined
  
  /** IP address of the BGP interface outside Google Cloud Platform. Only IPv4 is supported. */
  var peerIpAddress: js.UndefOr[String] = js.undefined
}
object RouterBgpPeer {
  
  inline def apply(): RouterBgpPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterBgpPeer]
  }
  
  extension [Self <: RouterBgpPeer](x: Self) {
    
    inline def setAdvertiseMode(value: String): Self = StObject.set(x, "advertiseMode", value.asInstanceOf[js.Any])
    
    inline def setAdvertiseModeUndefined: Self = StObject.set(x, "advertiseMode", js.undefined)
    
    inline def setAdvertisedGroups(value: js.Array[String]): Self = StObject.set(x, "advertisedGroups", value.asInstanceOf[js.Any])
    
    inline def setAdvertisedGroupsUndefined: Self = StObject.set(x, "advertisedGroups", js.undefined)
    
    inline def setAdvertisedGroupsVarargs(value: String*): Self = StObject.set(x, "advertisedGroups", js.Array(value :_*))
    
    inline def setAdvertisedIpRanges(value: js.Array[RouterAdvertisedIpRange]): Self = StObject.set(x, "advertisedIpRanges", value.asInstanceOf[js.Any])
    
    inline def setAdvertisedIpRangesUndefined: Self = StObject.set(x, "advertisedIpRanges", js.undefined)
    
    inline def setAdvertisedIpRangesVarargs(value: RouterAdvertisedIpRange*): Self = StObject.set(x, "advertisedIpRanges", js.Array(value :_*))
    
    inline def setAdvertisedRoutePriority(value: Double): Self = StObject.set(x, "advertisedRoutePriority", value.asInstanceOf[js.Any])
    
    inline def setAdvertisedRoutePriorityUndefined: Self = StObject.set(x, "advertisedRoutePriority", js.undefined)
    
    inline def setInterfaceName(value: String): Self = StObject.set(x, "interfaceName", value.asInstanceOf[js.Any])
    
    inline def setInterfaceNameUndefined: Self = StObject.set(x, "interfaceName", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setManagementType(value: String): Self = StObject.set(x, "managementType", value.asInstanceOf[js.Any])
    
    inline def setManagementTypeUndefined: Self = StObject.set(x, "managementType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPeerAsn(value: Double): Self = StObject.set(x, "peerAsn", value.asInstanceOf[js.Any])
    
    inline def setPeerAsnUndefined: Self = StObject.set(x, "peerAsn", js.undefined)
    
    inline def setPeerIpAddress(value: String): Self = StObject.set(x, "peerIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPeerIpAddressUndefined: Self = StObject.set(x, "peerIpAddress", js.undefined)
  }
}
