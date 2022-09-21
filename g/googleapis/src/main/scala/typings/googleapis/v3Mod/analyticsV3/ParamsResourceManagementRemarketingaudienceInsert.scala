package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementRemarketingaudienceInsert
  extends StObject
     with StandardParameters {
  
  /**
    * The account ID for which to create the remarketing audience.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRemarketingAudience] = js.undefined
  
  /**
    * Web property ID for which to create the remarketing audience.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementRemarketingaudienceInsert {
  
  inline def apply(): ParamsResourceManagementRemarketingaudienceInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementRemarketingaudienceInsert]
  }
  
  extension [Self <: ParamsResourceManagementRemarketingaudienceInsert](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setRequestBody(value: SchemaRemarketingAudience): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
