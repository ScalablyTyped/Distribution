package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaUpdateUserLinkRequest extends StObject {
  
  /**
    * Required. The user link to update.
    */
  var userLink: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaUserLink] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaUpdateUserLinkRequest {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaUpdateUserLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaUpdateUserLinkRequest]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaUpdateUserLinkRequest](x: Self) {
    
    inline def setUserLink(value: SchemaGoogleAnalyticsAdminV1alphaUserLink): Self = StObject.set(x, "userLink", value.asInstanceOf[js.Any])
    
    inline def setUserLinkUndefined: Self = StObject.set(x, "userLink", js.undefined)
  }
}
