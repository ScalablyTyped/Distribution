package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetworkSecondaryRange extends StObject {
  
  /**
    * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all
    * primary and secondary IP ranges within a network. Only IPv4 is supported. This may be a RFC 1918 IP range, or a privately, non-RFC 1918 IP range, not belonging to Google.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  
  /**
    * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The
    * name must be unique within the subnetwork.
    */
  var rangeName: js.UndefOr[String] = js.native
}
object SubnetworkSecondaryRange {
  
  @scala.inline
  def apply(): SubnetworkSecondaryRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetworkSecondaryRange]
  }
  
  @scala.inline
  implicit class SubnetworkSecondaryRangeMutableBuilder[Self <: SubnetworkSecondaryRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    @scala.inline
    def setRangeName(value: String): Self = StObject.set(x, "rangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeNameUndefined: Self = StObject.set(x, "rangeName", js.undefined)
  }
}
