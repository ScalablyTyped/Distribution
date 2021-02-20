package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsableSubnetwork extends StObject {
  
  /** The range of internal addresses that are owned by this subnetwork. */
  var ipCidrRange: js.UndefOr[String] = js.native
  
  /** Network URL. */
  var network: js.UndefOr[String] = js.native
  
  /** Secondary IP ranges. */
  var secondaryIpRanges: js.UndefOr[js.Array[UsableSubnetworkSecondaryRange]] = js.native
  
  /** Subnetwork URL. */
  var subnetwork: js.UndefOr[String] = js.native
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
    def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
  }
}
