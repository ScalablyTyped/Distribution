package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User-defined authentication requirements, including support for [JSON Web
  * Token
  * (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
  */
@js.native
trait SchemaAuthRequirement extends js.Object {
  
  /**
    * NOTE: This will be deprecated soon, once AuthProvider.audiences is
    * implemented and accepted in all the runtime components.  The list of JWT
    * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
    * that are allowed to access. A JWT containing any of these audiences will
    * be accepted. When this setting is absent, only JWTs with audience
    * &quot;https://Service_name/API_name&quot; will be accepted. For example,
    * if no audiences are in the setting, LibraryService API will only accept
    * JWTs with the following audience
    * &quot;https://library-example.googleapis.com/google.example.library.v1.LibraryService&quot;.
    * Example:      audiences: bookstore_android.apps.googleusercontent.com,
    * bookstore_web.apps.googleusercontent.com
    */
  var audiences: js.UndefOr[String] = js.native
  
  /**
    * id from authentication provider.  Example:      provider_id:
    * bookstore_auth
    */
  var providerId: js.UndefOr[String] = js.native
}
object SchemaAuthRequirement {
  
  @scala.inline
  def apply(): SchemaAuthRequirement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthRequirement]
  }
  
  @scala.inline
  implicit class SchemaAuthRequirementOps[Self <: SchemaAuthRequirement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAudiences(value: String): Self = this.set("audiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudiences: Self = this.set("audiences", js.undefined)
    
    @scala.inline
    def setProviderId(value: String): Self = this.set("providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderId: Self = this.set("providerId", js.undefined)
  }
}
