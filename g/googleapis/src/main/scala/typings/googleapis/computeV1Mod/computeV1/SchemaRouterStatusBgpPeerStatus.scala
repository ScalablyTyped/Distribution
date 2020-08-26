package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRouterStatusBgpPeerStatus extends js.Object {
  /**
    * Routes that were advertised to the remote BGP peer
    */
  var advertisedRoutes: js.UndefOr[js.Array[SchemaRoute]] = js.native
  /**
    * IP address of the local BGP interface.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * URL of the VPN tunnel that this BGP peer controls.
    */
  var linkedVpnTunnel: js.UndefOr[String] = js.native
  /**
    * Name of this BGP peer. Unique within the Routers resource.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Number of routes learned from the remote BGP Peer.
    */
  var numLearnedRoutes: js.UndefOr[Double] = js.native
  /**
    * IP address of the remote BGP interface.
    */
  var peerIpAddress: js.UndefOr[String] = js.native
  /**
    * BGP state as specified in RFC1771.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Status of the BGP peer: {UP, DOWN}
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23
    * hours, 59 minutes, 59 seconds
    */
  var uptime: js.UndefOr[String] = js.native
  /**
    * Time this session has been up, in seconds. Format: 145
    */
  var uptimeSeconds: js.UndefOr[String] = js.native
}

object SchemaRouterStatusBgpPeerStatus {
  @scala.inline
  def apply(): SchemaRouterStatusBgpPeerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterStatusBgpPeerStatus]
  }
  @scala.inline
  implicit class SchemaRouterStatusBgpPeerStatusOps[Self <: SchemaRouterStatusBgpPeerStatus] (val x: Self) extends AnyVal {
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
    def setAdvertisedRoutesVarargs(value: SchemaRoute*): Self = this.set("advertisedRoutes", js.Array(value :_*))
    @scala.inline
    def setAdvertisedRoutes(value: js.Array[SchemaRoute]): Self = this.set("advertisedRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertisedRoutes: Self = this.set("advertisedRoutes", js.undefined)
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    @scala.inline
    def setLinkedVpnTunnel(value: String): Self = this.set("linkedVpnTunnel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedVpnTunnel: Self = this.set("linkedVpnTunnel", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNumLearnedRoutes(value: Double): Self = this.set("numLearnedRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumLearnedRoutes: Self = this.set("numLearnedRoutes", js.undefined)
    @scala.inline
    def setPeerIpAddress(value: String): Self = this.set("peerIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerIpAddress: Self = this.set("peerIpAddress", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUptime(value: String): Self = this.set("uptime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUptime: Self = this.set("uptime", js.undefined)
    @scala.inline
    def setUptimeSeconds(value: String): Self = this.set("uptimeSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUptimeSeconds: Self = this.set("uptimeSeconds", js.undefined)
  }
  
}

