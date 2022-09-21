package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsableSubnetwork extends StObject {
  
  /** The range of internal addresses that are owned by this subnetwork. */
  var ipCidrRange: js.UndefOr[String] = js.undefined
  
  /** Network URL. */
  var network: js.UndefOr[String] = js.undefined
  
  /** Secondary IP ranges. */
  var secondaryIpRanges: js.UndefOr[js.Array[UsableSubnetworkSecondaryRange]] = js.undefined
  
  /** Subnetwork URL. */
  var subnetwork: js.UndefOr[String] = js.undefined
}
object UsableSubnetwork {
  
  inline def apply(): UsableSubnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsableSubnetwork]
  }
  
  extension [Self <: UsableSubnetwork](x: Self) {
    
    inline def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setSecondaryIpRanges(value: js.Array[UsableSubnetworkSecondaryRange]): Self = StObject.set(x, "secondaryIpRanges", value.asInstanceOf[js.Any])
    
    inline def setSecondaryIpRangesUndefined: Self = StObject.set(x, "secondaryIpRanges", js.undefined)
    
    inline def setSecondaryIpRangesVarargs(value: UsableSubnetworkSecondaryRange*): Self = StObject.set(x, "secondaryIpRanges", js.Array(value*))
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
  }
}
