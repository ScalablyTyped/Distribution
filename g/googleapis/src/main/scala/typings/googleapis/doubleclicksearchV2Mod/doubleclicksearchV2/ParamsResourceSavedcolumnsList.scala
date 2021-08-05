package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSavedcolumnsList
  extends StObject
     with StandardParameters {
  
  /**
    * DS ID of the advertiser.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * DS ID of the agency.
    */
  var agencyId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
}
object ParamsResourceSavedcolumnsList {
  
  inline def apply(): ParamsResourceSavedcolumnsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSavedcolumnsList]
  }
  
  extension [Self <: ParamsResourceSavedcolumnsList](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    inline def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
  }
}
