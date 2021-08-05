package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Secondary IP range of a usable subnetwork.
  */
trait SchemaUsableSubnetworkSecondaryRange extends StObject {
  
  /**
    * The range of IP addresses belonging to this subnetwork secondary range.
    */
  var ipCidrRange: js.UndefOr[String] = js.undefined
  
  /**
    * The name associated with this subnetwork secondary range, used when
    * adding an alias IP range to a VM instance.
    */
  var rangeName: js.UndefOr[String] = js.undefined
  
  /**
    * This field is to determine the status of the secondary range
    * programmably.
    */
  var status: js.UndefOr[String] = js.undefined
}
object SchemaUsableSubnetworkSecondaryRange {
  
  inline def apply(): SchemaUsableSubnetworkSecondaryRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsableSubnetworkSecondaryRange]
  }
  
  extension [Self <: SchemaUsableSubnetworkSecondaryRange](x: Self) {
    
    inline def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    inline def setRangeName(value: String): Self = StObject.set(x, "rangeName", value.asInstanceOf[js.Any])
    
    inline def setRangeNameUndefined: Self = StObject.set(x, "rangeName", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
