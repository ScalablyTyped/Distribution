package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRangeReservation extends StObject {
  
  /**
    * Required. The size of the desired subnet. Use usual CIDR range notation. For example, '30' to find unused x.x.x.x/30 CIDR range. The goal is to determine if one of the allocated ranges has enough free space for a subnet of the requested size.
    */
  var ipPrefixLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. The name of one or more allocated IP address ranges associated with this private service access connection. If no range names are provided all ranges associated with this connection will be considered. If a CIDR range with the specified IP prefix length is not available within these ranges the validation fails.
    */
  var requestedRanges: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. The size of the desired secondary ranges for the subnet. Use usual CIDR range notation. For example, '30' to find unused x.x.x.x/30 CIDR range. The goal is to determine that the allocated ranges have enough free space for all the requested secondary ranges.
    */
  var secondaryRangeIpPrefixLengths: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Optional. List of subnetwork candidates to validate. The required input fields are `name`, `network`, and `region`. Subnetworks from this list which exist will be returned in the response with the `ip_cidr_range`, `secondary_ip_cider_ranges`, and `outside_allocation` fields set.
    */
  var subnetworkCandidates: js.UndefOr[js.Array[SchemaSubnetwork]] = js.undefined
}
object SchemaRangeReservation {
  
  inline def apply(): SchemaRangeReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRangeReservation]
  }
  
  extension [Self <: SchemaRangeReservation](x: Self) {
    
    inline def setIpPrefixLength(value: Double): Self = StObject.set(x, "ipPrefixLength", value.asInstanceOf[js.Any])
    
    inline def setIpPrefixLengthNull: Self = StObject.set(x, "ipPrefixLength", null)
    
    inline def setIpPrefixLengthUndefined: Self = StObject.set(x, "ipPrefixLength", js.undefined)
    
    inline def setRequestedRanges(value: js.Array[String]): Self = StObject.set(x, "requestedRanges", value.asInstanceOf[js.Any])
    
    inline def setRequestedRangesNull: Self = StObject.set(x, "requestedRanges", null)
    
    inline def setRequestedRangesUndefined: Self = StObject.set(x, "requestedRanges", js.undefined)
    
    inline def setRequestedRangesVarargs(value: String*): Self = StObject.set(x, "requestedRanges", js.Array(value*))
    
    inline def setSecondaryRangeIpPrefixLengths(value: js.Array[Double]): Self = StObject.set(x, "secondaryRangeIpPrefixLengths", value.asInstanceOf[js.Any])
    
    inline def setSecondaryRangeIpPrefixLengthsNull: Self = StObject.set(x, "secondaryRangeIpPrefixLengths", null)
    
    inline def setSecondaryRangeIpPrefixLengthsUndefined: Self = StObject.set(x, "secondaryRangeIpPrefixLengths", js.undefined)
    
    inline def setSecondaryRangeIpPrefixLengthsVarargs(value: Double*): Self = StObject.set(x, "secondaryRangeIpPrefixLengths", js.Array(value*))
    
    inline def setSubnetworkCandidates(value: js.Array[SchemaSubnetwork]): Self = StObject.set(x, "subnetworkCandidates", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkCandidatesUndefined: Self = StObject.set(x, "subnetworkCandidates", js.undefined)
    
    inline def setSubnetworkCandidatesVarargs(value: SchemaSubnetwork*): Self = StObject.set(x, "subnetworkCandidates", js.Array(value*))
  }
}
