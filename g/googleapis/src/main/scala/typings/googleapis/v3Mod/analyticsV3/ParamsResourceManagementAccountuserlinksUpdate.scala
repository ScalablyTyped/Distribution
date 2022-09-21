package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementAccountuserlinksUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID to update the account-user link for.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Link ID to update the account-user link for.
    */
  var linkId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEntityUserLink] = js.undefined
}
object ParamsResourceManagementAccountuserlinksUpdate {
  
  inline def apply(): ParamsResourceManagementAccountuserlinksUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementAccountuserlinksUpdate]
  }
  
  extension [Self <: ParamsResourceManagementAccountuserlinksUpdate](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setRequestBody(value: SchemaEntityUserLink): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
