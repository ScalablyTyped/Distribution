package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasIpRange extends StObject {
  
  /**
    * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other
    * network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
    */
  var ipCidrRange: js.UndefOr[String] = js.undefined
  
  /** The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used. */
  var subnetworkRangeName: js.UndefOr[String] = js.undefined
}
object AliasIpRange {
  
  @scala.inline
  def apply(): AliasIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasIpRange]
  }
  
  @scala.inline
  implicit class AliasIpRangeMutableBuilder[Self <: AliasIpRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    @scala.inline
    def setSubnetworkRangeName(value: String): Self = StObject.set(x, "subnetworkRangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworkRangeNameUndefined: Self = StObject.set(x, "subnetworkRangeName", js.undefined)
  }
}
