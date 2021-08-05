package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementTargeting extends StObject {
  
  /** Mobile application targeting information in a deal. This doesn't apply to Auction Packages. */
  var mobileApplicationTargeting: js.UndefOr[MobileApplicationTargeting] = js.undefined
  
  /** URLs to be included/excluded. */
  var urlTargeting: js.UndefOr[UrlTargeting] = js.undefined
}
object PlacementTargeting {
  
  inline def apply(): PlacementTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementTargeting]
  }
  
  extension [Self <: PlacementTargeting](x: Self) {
    
    inline def setMobileApplicationTargeting(value: MobileApplicationTargeting): Self = StObject.set(x, "mobileApplicationTargeting", value.asInstanceOf[js.Any])
    
    inline def setMobileApplicationTargetingUndefined: Self = StObject.set(x, "mobileApplicationTargeting", js.undefined)
    
    inline def setUrlTargeting(value: UrlTargeting): Self = StObject.set(x, "urlTargeting", value.asInstanceOf[js.Any])
    
    inline def setUrlTargetingUndefined: Self = StObject.set(x, "urlTargeting", js.undefined)
  }
}
