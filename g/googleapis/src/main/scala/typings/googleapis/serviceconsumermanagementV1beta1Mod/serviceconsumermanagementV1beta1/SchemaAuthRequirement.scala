package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthRequirement extends StObject {
  
  /**
    * NOTE: This will be deprecated soon, once AuthProvider.audiences is implemented and accepted in all the runtime components. The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, only JWTs with audience "https://Service_name/API_name" will be accepted. For example, if no audiences are in the setting, LibraryService API will only accept JWTs with the following audience "https://library-example.googleapis.com/google.example.library.v1.LibraryService". Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
    */
  var audiences: js.UndefOr[String | Null] = js.undefined
  
  /**
    * id from authentication provider. Example: provider_id: bookstore_auth
    */
  var providerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuthRequirement {
  
  inline def apply(): SchemaAuthRequirement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthRequirement]
  }
  
  extension [Self <: SchemaAuthRequirement](x: Self) {
    
    inline def setAudiences(value: String): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
    
    inline def setAudiencesNull: Self = StObject.set(x, "audiences", null)
    
    inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setProviderIdNull: Self = StObject.set(x, "providerId", null)
    
    inline def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
  }
}
