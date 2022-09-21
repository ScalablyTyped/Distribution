package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecondaryIpRange extends StObject {
  
  /**
    * Secondary IP CIDR range in `x.x.x.x/y` format.
    */
  var ipCidrRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the secondary IP range.
    */
  var rangeName: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecondaryIpRange {
  
  inline def apply(): SchemaSecondaryIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecondaryIpRange]
  }
  
  extension [Self <: SchemaSecondaryIpRange](x: Self) {
    
    inline def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpCidrRangeNull: Self = StObject.set(x, "ipCidrRange", null)
    
    inline def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    inline def setRangeName(value: String): Self = StObject.set(x, "rangeName", value.asInstanceOf[js.Any])
    
    inline def setRangeNameNull: Self = StObject.set(x, "rangeName", null)
    
    inline def setRangeNameUndefined: Self = StObject.set(x, "rangeName", js.undefined)
  }
}
