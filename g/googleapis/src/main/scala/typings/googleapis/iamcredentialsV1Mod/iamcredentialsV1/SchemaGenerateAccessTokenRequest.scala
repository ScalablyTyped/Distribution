package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGenerateAccessTokenRequest extends StObject {
  
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
    * The desired lifetime duration of the access token in seconds. Must be set
    * to a value less than or equal to 3600 (1 hour). If a value is not
    * specified, the token&#39;s lifetime will be set to a default value of one
    * hour.
    */
  var lifetime: js.UndefOr[String] = js.native
  
  /**
    * Code to identify the scopes to be included in the OAuth 2.0 access token.
    * See https://developers.google.com/identity/protocols/googlescopes for
    * more information. At least one value required.
    */
  var scope: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGenerateAccessTokenRequest {
  
  @scala.inline
  def apply(): SchemaGenerateAccessTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateAccessTokenRequest]
  }
  
  @scala.inline
  implicit class SchemaGenerateAccessTokenRequestMutableBuilder[Self <: SchemaGenerateAccessTokenRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegates(value: js.Array[String]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
    
    @scala.inline
    def setDelegatesVarargs(value: String*): Self = StObject.set(x, "delegates", js.Array(value :_*))
    
    @scala.inline
    def setLifetime(value: String): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
    
    @scala.inline
    def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
  }
}
