package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for private clusters.
  */
@js.native
trait SchemaPrivateClusterConfig extends js.Object {
  /**
    * Whether the master&#39;s internal IP address is used as the cluster
    * endpoint.
    */
  var enablePrivateEndpoint: js.UndefOr[Boolean] = js.native
  /**
    * Whether nodes have internal IP addresses only. If enabled, all nodes are
    * given only RFC 1918 private addresses and communicate with the master via
    * private networking.
    */
  var enablePrivateNodes: js.UndefOr[Boolean] = js.native
  /**
    * The IP range in CIDR notation to use for the hosted master network. This
    * range will be used for assigning internal IP addresses to the master or
    * set of masters, as well as the ILB VIP. This range must not overlap with
    * any other ranges in use within the cluster&#39;s network.
    */
  var masterIpv4CidrBlock: js.UndefOr[String] = js.native
  /**
    * Output only. The internal IP address of this cluster&#39;s master
    * endpoint.
    */
  var privateEndpoint: js.UndefOr[String] = js.native
  /**
    * Output only. The external IP address of this cluster&#39;s master
    * endpoint.
    */
  var publicEndpoint: js.UndefOr[String] = js.native
}

object SchemaPrivateClusterConfig {
  @scala.inline
  def apply(): SchemaPrivateClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateClusterConfig]
  }
  @scala.inline
  implicit class SchemaPrivateClusterConfigOps[Self <: SchemaPrivateClusterConfig] (val x: Self) extends AnyVal {
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
    def setEnablePrivateEndpoint(value: Boolean): Self = this.set("enablePrivateEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePrivateEndpoint: Self = this.set("enablePrivateEndpoint", js.undefined)
    @scala.inline
    def setEnablePrivateNodes(value: Boolean): Self = this.set("enablePrivateNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePrivateNodes: Self = this.set("enablePrivateNodes", js.undefined)
    @scala.inline
    def setMasterIpv4CidrBlock(value: String): Self = this.set("masterIpv4CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterIpv4CidrBlock: Self = this.set("masterIpv4CidrBlock", js.undefined)
    @scala.inline
    def setPrivateEndpoint(value: String): Self = this.set("privateEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateEndpoint: Self = this.set("privateEndpoint", js.undefined)
    @scala.inline
    def setPublicEndpoint(value: String): Self = this.set("publicEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicEndpoint: Self = this.set("publicEndpoint", js.undefined)
  }
  
}

