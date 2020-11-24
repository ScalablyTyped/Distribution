package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AliasIpRange extends js.Object {
  
  /**
    * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other
    * network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  
  /** The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used. */
  var subnetworkRangeName: js.UndefOr[String] = js.native
}
object AliasIpRange {
  
  @scala.inline
  def apply(): AliasIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasIpRange]
  }
  
  @scala.inline
  implicit class AliasIpRangeOps[Self <: AliasIpRange] (val x: Self) extends AnyVal {
    
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
    def setIpCidrRange(value: String): Self = this.set("ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpCidrRange: Self = this.set("ipCidrRange", js.undefined)
    
    @scala.inline
    def setSubnetworkRangeName(value: String): Self = this.set("subnetworkRangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetworkRangeName: Self = this.set("subnetworkRangeName", js.undefined)
  }
}
