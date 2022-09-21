package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementRemarketingaudienceDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID to which the remarketing audience belongs.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the remarketing audience to delete.
    */
  var remarketingAudienceId: js.UndefOr[String] = js.undefined
  
  /**
    * Web property ID to which the remarketing audience belongs.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementRemarketingaudienceDelete {
  
  inline def apply(): ParamsResourceManagementRemarketingaudienceDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementRemarketingaudienceDelete]
  }
  
  extension [Self <: ParamsResourceManagementRemarketingaudienceDelete](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setRemarketingAudienceId(value: String): Self = StObject.set(x, "remarketingAudienceId", value.asInstanceOf[js.Any])
    
    inline def setRemarketingAudienceIdUndefined: Self = StObject.set(x, "remarketingAudienceId", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
