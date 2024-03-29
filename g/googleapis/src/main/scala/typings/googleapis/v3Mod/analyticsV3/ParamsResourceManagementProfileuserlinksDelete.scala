package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementProfileuserlinksDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID to delete the user link for.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Link ID to delete the user link for.
    */
  var linkId: js.UndefOr[String] = js.undefined
  
  /**
    * View (Profile) ID to delete the user link for.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Web Property ID to delete the user link for.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementProfileuserlinksDelete {
  
  inline def apply(): ParamsResourceManagementProfileuserlinksDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementProfileuserlinksDelete]
  }
  
  extension [Self <: ParamsResourceManagementProfileuserlinksDelete](x: Self) {
    
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
