package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubnetwork extends StObject {
  
  /**
    * Subnetwork CIDR range in `10.x.x.x/y` format.
    */
  var ipCidrRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subnetwork name. See https://cloud.google.com/compute/docs/vpc/
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * In the Shared VPC host project, the VPC network that's peered with the consumer network. For example: `projects/1234321/global/networks/host-network`
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is a discovered subnet that is not within the current consumer allocated ranges.
    */
  var outsideAllocation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * GCP region where the subnetwork is located.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of secondary IP ranges in this subnetwork.
    */
  var secondaryIpRanges: js.UndefOr[js.Array[SchemaSecondaryIpRange]] = js.undefined
}
object SchemaSubnetwork {
  
  inline def apply(): SchemaSubnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetwork]
  }
  
  extension [Self <: SchemaSubnetwork](x: Self) {
    
    inline def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpCidrRangeNull: Self = StObject.set(x, "ipCidrRange", null)
    
    inline def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setOutsideAllocation(value: Boolean): Self = StObject.set(x, "outsideAllocation", value.asInstanceOf[js.Any])
    
    inline def setOutsideAllocationNull: Self = StObject.set(x, "outsideAllocation", null)
    
    inline def setOutsideAllocationUndefined: Self = StObject.set(x, "outsideAllocation", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSecondaryIpRanges(value: js.Array[SchemaSecondaryIpRange]): Self = StObject.set(x, "secondaryIpRanges", value.asInstanceOf[js.Any])
    
    inline def setSecondaryIpRangesUndefined: Self = StObject.set(x, "secondaryIpRanges", js.undefined)
    
    inline def setSecondaryIpRangesVarargs(value: SchemaSecondaryIpRange*): Self = StObject.set(x, "secondaryIpRanges", js.Array(value*))
  }
}
