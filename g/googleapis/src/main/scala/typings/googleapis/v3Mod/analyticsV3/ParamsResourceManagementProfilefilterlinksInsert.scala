package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementProfilefilterlinksInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID to create profile filter link for.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Profile ID to create filter link for.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProfileFilterLink] = js.undefined
  
  /**
    * Web property Id to create profile filter link for.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementProfilefilterlinksInsert {
  
  inline def apply(): ParamsResourceManagementProfilefilterlinksInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementProfilefilterlinksInsert]
  }
  
  extension [Self <: ParamsResourceManagementProfilefilterlinksInsert](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setRequestBody(value: SchemaProfileFilterLink): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
