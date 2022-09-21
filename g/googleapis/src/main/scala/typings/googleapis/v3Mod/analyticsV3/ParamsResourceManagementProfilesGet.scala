package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementProfilesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID to retrieve the view (profile) for.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * View (Profile) ID to retrieve the view (profile) for.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Web property ID to retrieve the view (profile) for.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementProfilesGet {
  
  inline def apply(): ParamsResourceManagementProfilesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementProfilesGet]
  }
  
  extension [Self <: ParamsResourceManagementProfilesGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
