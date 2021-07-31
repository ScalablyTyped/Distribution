package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsableSubnetwork extends StObject {
  
  /** The range of internal addresses that are owned by this subnetwork. */
  var ipCidrRange: js.UndefOr[String] = js.undefined
  
  /** Network Name. Example: projects/my-project/global/networks/my-network */
  var network: js.UndefOr[String] = js.undefined
  
  /** Secondary IP ranges. */
  var secondaryIpRanges: js.UndefOr[js.Array[UsableSubnetworkSecondaryRange]] = js.undefined
  
  /**
    * A human readable status message representing the reasons for cases where the caller cannot use the secondary ranges under the subnet. For example if the secondary_ip_ranges is empty
    * due to a permission issue, an insufficient permission message will be given by status_message.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /** Subnetwork Name. Example: projects/my-project/regions/us-central1/subnetworks/my-subnet */
  var subnetwork: js.UndefOr[String] = js.undefined
}
object UsableSubnetwork {
  
  @scala.inline
  def apply(): UsableSubnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsableSubnetwork]
  }
  
  @scala.inline
  implicit class UsableSubnetworkMutableBuilder[Self <: UsableSubnetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setSecondaryIpRanges(value: js.Array[UsableSubnetworkSecondaryRange]): Self = StObject.set(x, "secondaryIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryIpRangesUndefined: Self = StObject.set(x, "secondaryIpRanges", js.undefined)
    
    @scala.inline
    def setSecondaryIpRangesVarargs(value: UsableSubnetworkSecondaryRange*): Self = StObject.set(x, "secondaryIpRanges", js.Array(value :_*))
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
  }
}
