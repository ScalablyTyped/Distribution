package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGenerateAccessTokenRequest extends js.Object {
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
  implicit class SchemaGenerateAccessTokenRequestOps[Self <: SchemaGenerateAccessTokenRequest] (val x: Self) extends AnyVal {
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
    def setDelegatesVarargs(value: String*): Self = this.set("delegates", js.Array(value :_*))
    @scala.inline
    def setDelegates(value: js.Array[String]): Self = this.set("delegates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegates: Self = this.set("delegates", js.undefined)
    @scala.inline
    def setLifetime(value: String): Self = this.set("lifetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifetime: Self = this.set("lifetime", js.undefined)
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    @scala.inline
    def setScope(value: js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

