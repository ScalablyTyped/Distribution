package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse extends StObject {
  
  /**
    * The user links created.
    */
  var userLinks: js.UndefOr[js.Array[SchemaGoogleAnalyticsAdminV1alphaUserLink]] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaBatchCreateUserLinksResponse](x: Self) {
    
    inline def setUserLinks(value: js.Array[SchemaGoogleAnalyticsAdminV1alphaUserLink]): Self = StObject.set(x, "userLinks", value.asInstanceOf[js.Any])
    
    inline def setUserLinksUndefined: Self = StObject.set(x, "userLinks", js.undefined)
    
    inline def setUserLinksVarargs(value: SchemaGoogleAnalyticsAdminV1alphaUserLink*): Self = StObject.set(x, "userLinks", js.Array(value*))
  }
}
