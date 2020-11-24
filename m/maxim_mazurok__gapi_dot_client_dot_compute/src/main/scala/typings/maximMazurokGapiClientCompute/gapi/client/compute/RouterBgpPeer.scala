package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterBgpPeer extends js.Object {
  
  /** User-specified flag to indicate which mode to use for advertisement. */
  var advertiseMode: js.UndefOr[String] = js.native
  
  /**
    * User-specified list of prefix groups to advertise in custom mode, which can take one of the following options:
    * - ALL_SUBNETS: Advertises all available subnets, including peer VPC subnets.
    * - ALL_VPC_SUBNETS: Advertises the router's own VPC subnets.
    * - ALL_PEER_VPC_SUBNETS: Advertises peer subnets of the router's VPC network. Note that this field can only be populated if advertise_mode is CUSTOM and overrides the list defined
    * for the router (in the "bgp" message). These groups are advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
    */
  var advertisedGroups: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router
    * (in the "bgp" message). These IP ranges are advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
    */
  var advertisedIpRanges: js.UndefOr[js.Array[RouterAdvertisedIpRange]] = js.native
  
  /** The priority of routes advertised to this BGP peer. Where there is more than one matching route of maximum length, the routes with the lowest priority value win. */
  var advertisedRoutePriority: js.UndefOr[Double] = js.native
  
  /** Name of the interface the BGP peer is associated with. */
  var interfaceName: js.UndefOr[String] = js.native
  
  /** IP address of the interface inside Google Cloud Platform. Only IPv4 is supported. */
  var ipAddress: js.UndefOr[String] = js.native
  
  /**
    * [Output Only] The resource that configures and manages this BGP peer.
    * - MANAGED_BY_USER is the default value and can be managed by you or other users
    * - MANAGED_BY_ATTACHMENT is a BGP peer that is configured and managed by Cloud Interconnect, specifically by an InterconnectAttachment of type PARTNER. Google automatically creates,
    * updates, and deletes this type of BGP peer when the PARTNER InterconnectAttachment is created, updated, or deleted.
    */
  var managementType: js.UndefOr[String] = js.native
  
  /**
    * Name of this BGP peer. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression
    * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last
    * character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value. */
  var peerAsn: js.UndefOr[Double] = js.native
  
  /** IP address of the BGP interface outside Google Cloud Platform. Only IPv4 is supported. */
  var peerIpAddress: js.UndefOr[String] = js.native
}
object RouterBgpPeer {
  
  @scala.inline
  def apply(): RouterBgpPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterBgpPeer]
  }
  
  @scala.inline
  implicit class RouterBgpPeerOps[Self <: RouterBgpPeer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdvertiseMode(value: String): Self = this.set("advertiseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiseMode: Self = this.set("advertiseMode", js.undefined)
    
    @scala.inline
    def setAdvertisedGroupsVarargs(value: String*): Self = this.set("advertisedGroups", js.Array(value :_*))
    
    @scala.inline
    def setAdvertisedGroups(value: js.Array[String]): Self = this.set("advertisedGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertisedGroups: Self = this.set("advertisedGroups", js.undefined)
    
    @scala.inline
    def setAdvertisedIpRangesVarargs(value: RouterAdvertisedIpRange*): Self = this.set("advertisedIpRanges", js.Array(value :_*))
    
    @scala.inline
    def setAdvertisedIpRanges(value: js.Array[RouterAdvertisedIpRange]): Self = this.set("advertisedIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertisedIpRanges: Self = this.set("advertisedIpRanges", js.undefined)
    
    @scala.inline
    def setAdvertisedRoutePriority(value: Double): Self = this.set("advertisedRoutePriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertisedRoutePriority: Self = this.set("advertisedRoutePriority", js.undefined)
    
    @scala.inline
    def setInterfaceName(value: String): Self = this.set("interfaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterfaceName: Self = this.set("interfaceName", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setManagementType(value: String): Self = this.set("managementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagementType: Self = this.set("managementType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPeerAsn(value: Double): Self = this.set("peerAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerAsn: Self = this.set("peerAsn", js.undefined)
    
    @scala.inline
    def setPeerIpAddress(value: String): Self = this.set("peerIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerIpAddress: Self = this.set("peerIpAddress", js.undefined)
  }
}
