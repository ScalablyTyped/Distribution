package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementProfilefilterlinksGet
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID to retrieve profile filter link for.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the profile filter link.
    */
  var linkId: js.UndefOr[String] = js.undefined
  
  /**
    * Profile ID to retrieve filter link for.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Web property Id to retrieve profile filter link for.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementProfilefilterlinksGet {
  
  inline def apply(): ParamsResourceManagementProfilefilterlinksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementProfilefilterlinksGet]
  }
  
  extension [Self <: ParamsResourceManagementProfilefilterlinksGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
