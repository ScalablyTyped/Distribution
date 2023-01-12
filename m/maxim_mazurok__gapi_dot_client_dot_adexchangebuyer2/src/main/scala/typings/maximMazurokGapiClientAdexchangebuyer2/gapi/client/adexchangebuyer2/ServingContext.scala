package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServingContext extends StObject {
  
  /** Matches all contexts. */
  var all: js.UndefOr[String] = js.undefined
  
  /** Matches impressions for a particular app type. */
  var appType: js.UndefOr[AppContext] = js.undefined
  
  /** Matches impressions for a particular auction type. */
  var auctionType: js.UndefOr[AuctionContext] = js.undefined
  
  /** Matches impressions coming from users *or* publishers in a specific location. */
  var location: js.UndefOr[LocationContext] = js.undefined
  
  /** Matches impressions coming from a particular platform. */
  var platform: js.UndefOr[PlatformContext] = js.undefined
  
  /** Matches impressions for a particular security type. */
  var securityType: js.UndefOr[SecurityContext] = js.undefined
}
object ServingContext {
  
  inline def apply(): ServingContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServingContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServingContext] (val x: Self) extends AnyVal {
    
    inline def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setAppType(value: AppContext): Self = StObject.set(x, "appType", value.asInstanceOf[js.Any])
    
    inline def setAppTypeUndefined: Self = StObject.set(x, "appType", js.undefined)
    
    inline def setAuctionType(value: AuctionContext): Self = StObject.set(x, "auctionType", value.asInstanceOf[js.Any])
    
    inline def setAuctionTypeUndefined: Self = StObject.set(x, "auctionType", js.undefined)
    
    inline def setLocation(value: LocationContext): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPlatform(value: PlatformContext): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setSecurityType(value: SecurityContext): Self = StObject.set(x, "securityType", value.asInstanceOf[js.Any])
    
    inline def setSecurityTypeUndefined: Self = StObject.set(x, "securityType", js.undefined)
  }
}
