package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsableSubnetworkSecondaryRange extends js.Object {
  
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
  implicit class UsableSubnetworkSecondaryRangeOps[Self <: UsableSubnetworkSecondaryRange] (val x: Self) extends AnyVal {
    
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
    def setRangeName(value: String): Self = this.set("rangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeName: Self = this.set("rangeName", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
