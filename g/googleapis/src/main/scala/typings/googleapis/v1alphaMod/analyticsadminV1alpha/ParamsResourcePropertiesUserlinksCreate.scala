package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesUserlinksCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. If set, then email the new user notifying them that they've been granted permissions to the resource.
    */
  var notifyNewUser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. Example format: accounts/1234
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaUserLink] = js.undefined
}
object ParamsResourcePropertiesUserlinksCreate {
  
  inline def apply(): ParamsResourcePropertiesUserlinksCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesUserlinksCreate]
  }
  
  extension [Self <: ParamsResourcePropertiesUserlinksCreate](x: Self) {
    
    inline def setNotifyNewUser(value: Boolean): Self = StObject.set(x, "notifyNewUser", value.asInstanceOf[js.Any])
    
    inline def setNotifyNewUserUndefined: Self = StObject.set(x, "notifyNewUser", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaUserLink): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
