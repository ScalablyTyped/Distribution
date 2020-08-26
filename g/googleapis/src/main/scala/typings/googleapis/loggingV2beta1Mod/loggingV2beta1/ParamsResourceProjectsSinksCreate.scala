package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsSinksCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The resource in which to create the sink:
    * "projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]" Examples:
    * "projects/my-logging-project", "organizations/123456789".
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLogSink] = js.native
  /**
    * Optional. Determines the kind of IAM identity returned as writer_identity
    * in the new sink. If this value is omitted or set to false, and if the
    * sink's parent is a project, then the value returned as writer_identity is
    * the same group or service account used by Logging before the addition of
    * writer identities to this API. The sink's destination must be in the same
    * project as the sink itself.If this field is set to true, or if the sink
    * is owned by a non-project resource such as an organization, then the
    * value of writer_identity will be a unique service account used only for
    * exports from the new sink. For more information, see writer_identity in
    * LogSink.
    */
  var uniqueWriterIdentity: js.UndefOr[Boolean] = js.native
}

object ParamsResourceProjectsSinksCreate {
  @scala.inline
  def apply(): ParamsResourceProjectsSinksCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSinksCreate]
  }
  @scala.inline
  implicit class ParamsResourceProjectsSinksCreateOps[Self <: ParamsResourceProjectsSinksCreate] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaLogSink): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setUniqueWriterIdentity(value: Boolean): Self = this.set("uniqueWriterIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueWriterIdentity: Self = this.set("uniqueWriterIdentity", js.undefined)
  }
  
}

