package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaCreateUserLinkRequest extends StObject {
  
  /**
    * Optional. If set, then email the new user notifying them that they've been granted permissions to the resource.
    */
  var notifyNewUser: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. Example format: accounts/1234
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The user link to create.
    */
  var userLink: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaUserLink] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaCreateUserLinkRequest {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaCreateUserLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaCreateUserLinkRequest]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaCreateUserLinkRequest](x: Self) {
    
    inline def setNotifyNewUser(value: Boolean): Self = StObject.set(x, "notifyNewUser", value.asInstanceOf[js.Any])
    
    inline def setNotifyNewUserNull: Self = StObject.set(x, "notifyNewUser", null)
    
    inline def setNotifyNewUserUndefined: Self = StObject.set(x, "notifyNewUser", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setUserLink(value: SchemaGoogleAnalyticsAdminV1alphaUserLink): Self = StObject.set(x, "userLink", value.asInstanceOf[js.Any])
    
    inline def setUserLinkUndefined: Self = StObject.set(x, "userLink", js.undefined)
  }
}
