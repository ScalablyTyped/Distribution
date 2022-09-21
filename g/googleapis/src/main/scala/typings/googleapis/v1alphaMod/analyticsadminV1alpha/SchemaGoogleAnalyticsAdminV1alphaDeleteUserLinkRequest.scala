package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaDeleteUserLinkRequest extends StObject {
  
  /**
    * Required. Example format: accounts/1234/userLinks/5678
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaDeleteUserLinkRequest {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaDeleteUserLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaDeleteUserLinkRequest]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaDeleteUserLinkRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
