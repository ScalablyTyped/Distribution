package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterAdvertisedIpRange extends StObject {
  
  /** User-specified description for the IP range. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The IP range to advertise. The value must be a CIDR-formatted string. */
  var range: js.UndefOr[String] = js.undefined
}
object RouterAdvertisedIpRange {
  
  inline def apply(): RouterAdvertisedIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterAdvertisedIpRange]
  }
  
  extension [Self <: RouterAdvertisedIpRange](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
