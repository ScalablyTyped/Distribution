package typings.googleapis.serviceusageV1Mod.serviceusageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(audiences: String = null, providerId: String = null): SchemaAuthRequirement = {
    val __obj = js.Dynamic.literal()
    if (audiences != null) __obj.updateDynamic("audiences")(audiences.asInstanceOf[js.Any])
    if (providerId != null) __obj.updateDynamic("providerId")(providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuthRequirement]
  }
}

