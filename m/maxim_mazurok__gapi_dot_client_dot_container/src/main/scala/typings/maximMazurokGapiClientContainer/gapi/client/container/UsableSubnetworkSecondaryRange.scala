package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsableSubnetworkSecondaryRange extends StObject {
  
  /** The range of IP addresses belonging to this subnetwork secondary range. */
  var ipCidrRange: js.UndefOr[String] = js.native
  
  /** The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. */
  var rangeName: js.UndefOr[String] = js.native
  
  /** This field is to determine the status of the secondary range programmably. */
  var status: js.UndefOr[String] = js.native
}
object UsableSubnetworkSecondaryRange {
  
  @scala.inline
  def apply(): UsableSubnetworkSecondaryRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsableSubnetworkSecondaryRange]
  }
  
  @scala.inline
  implicit class UsableSubnetworkSecondaryRangeMutableBuilder[Self <: UsableSubnetworkSecondaryRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    @scala.inline
    def setRangeName(value: String): Self = StObject.set(x, "rangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeNameUndefined: Self = StObject.set(x, "rangeName", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
