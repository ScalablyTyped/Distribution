package typings.maximMazurokGapiClientComposer.gapi.client.composer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateClusterConfig extends js.Object {
  
  /** Optional. If `true`, access to the public endpoint of the GKE cluster is denied. */
  var enablePrivateEndpoint: js.UndefOr[Boolean] = js.native
  
  /** Optional. The CIDR block from which IPv4 range for GKE master will be reserved. If left blank, the default value of '172.16.0.0/23' is used. */
  var masterIpv4CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * Output only. The IP range in CIDR notation to use for the hosted master network. This range is used for assigning internal IP addresses to the GKE cluster master or set of masters
    * and to the internal load balancer virtual IP. This range must not overlap with any other ranges in use within the cluster's network.
    */
  var masterIpv4ReservedRange: js.UndefOr[String] = js.native
}
object PrivateClusterConfig {
  
  @scala.inline
  def apply(): PrivateClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateClusterConfig]
  }
  
  @scala.inline
  implicit class PrivateClusterConfigOps[Self <: PrivateClusterConfig] (val x: Self) extends AnyVal {
    
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
    def setMasterIpv4CidrBlock(value: String): Self = this.set("masterIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterIpv4CidrBlock: Self = this.set("masterIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setMasterIpv4ReservedRange(value: String): Self = this.set("masterIpv4ReservedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterIpv4ReservedRange: Self = this.set("masterIpv4ReservedRange", js.undefined)
  }
}
