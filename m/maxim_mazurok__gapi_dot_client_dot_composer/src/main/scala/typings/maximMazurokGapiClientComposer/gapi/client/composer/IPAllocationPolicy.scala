package typings.maximMazurokGapiClientComposer.gapi.client.composer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait IPAllocationPolicy extends js.Object {
  
  /**
    * Optional. The IP address range used to allocate IP addresses to pods in the GKE cluster. This field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose
    * a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
    * `192.168.0.0/16`) to pick a specific range to use.
    */
  var clusterIpv4CidrBlock: js.UndefOr[String] = js.native
  
  /** Optional. The name of the GKE cluster's secondary range used to allocate IP addresses to pods. This field is applicable only when `use_ip_aliases` is true. */
  var clusterSecondaryRangeName: js.UndefOr[String] = js.native
  
  /**
    * Optional. The IP address range of the services IP addresses in this GKE cluster. This field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range
    * with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
    */
  var servicesIpv4CidrBlock: js.UndefOr[String] = js.native
  
  /** Optional. The name of the services' secondary range used to allocate IP addresses to the GKE cluster. This field is applicable only when `use_ip_aliases` is true. */
  var servicesSecondaryRangeName: js.UndefOr[String] = js.native
  
  /** Optional. Whether or not to enable Alias IPs in the GKE cluster. If `true`, a VPC-native cluster is created. */
  var useIpAliases: js.UndefOr[Boolean] = js.native
}
object IPAllocationPolicy {
  
  @scala.inline
  def apply(): IPAllocationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPAllocationPolicy]
  }
  
  @scala.inline
  implicit class IPAllocationPolicyOps[Self <: IPAllocationPolicy] (val x: Self) extends AnyVal {
    
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
    def setClusterIpv4CidrBlock(value: String): Self = this.set("clusterIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIpv4CidrBlock: Self = this.set("clusterIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setClusterSecondaryRangeName(value: String): Self = this.set("clusterSecondaryRangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSecondaryRangeName: Self = this.set("clusterSecondaryRangeName", js.undefined)
    
    @scala.inline
    def setServicesIpv4CidrBlock(value: String): Self = this.set("servicesIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicesIpv4CidrBlock: Self = this.set("servicesIpv4CidrBlock", js.undefined)
    
    @scala.inline
    def setServicesSecondaryRangeName(value: String): Self = this.set("servicesSecondaryRangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicesSecondaryRangeName: Self = this.set("servicesSecondaryRangeName", js.undefined)
    
    @scala.inline
    def setUseIpAliases(value: Boolean): Self = this.set("useIpAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseIpAliases: Self = this.set("useIpAliases", js.undefined)
  }
}
