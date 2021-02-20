package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGenerateIdTokenRequest extends StObject {
  
  /**
    * The audience for the token, such as the API or account that this token
    * grants access to.
    */
  var audience: js.UndefOr[String] = js.native
  
  /**
    * The sequence of service accounts in a delegation chain. Each service
    * account must be granted the `roles/iam.serviceAccountTokenCreator` role
    * on its next service account in the chain. The last service account in the
    * chain must be granted the `roles/iam.serviceAccountTokenCreator` role on
    * the service account that is specified in the `name` field of the request.
    * The delegates must have the following format:
    * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-`
    * wildcard character is required; replacing it with a project ID is
    * invalid.
    */
  var delegates: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Include the service account email in the token. If set to `true`, the
    * token will contain `email` and `email_verified` claims.
    */
  var includeEmail: js.UndefOr[Boolean] = js.native
}
object SchemaGenerateIdTokenRequest {
  
  @scala.inline
  def apply(): SchemaGenerateIdTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateIdTokenRequest]
  }
  
  @scala.inline
  implicit class SchemaGenerateIdTokenRequestMutableBuilder[Self <: SchemaGenerateIdTokenRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setDelegates(value: js.Array[String]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
    
    @scala.inline
    def setDelegatesVarargs(value: String*): Self = StObject.set(x, "delegates", js.Array(value :_*))
    
    @scala.inline
    def setIncludeEmail(value: Boolean): Self = StObject.set(x, "includeEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeEmailUndefined: Self = StObject.set(x, "includeEmail", js.undefined)
  }
}
