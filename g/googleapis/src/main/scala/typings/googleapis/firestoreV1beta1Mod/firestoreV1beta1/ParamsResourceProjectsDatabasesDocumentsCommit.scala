package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsDatabasesDocumentsCommit extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The database name. In the format:
    * `projects/{project_id}/databases/{database_id}`.
    */
  var database: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCommitRequest] = js.native
}

object ParamsResourceProjectsDatabasesDocumentsCommit {
  @scala.inline
  def apply(): ParamsResourceProjectsDatabasesDocumentsCommit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesDocumentsCommit]
  }
  @scala.inline
  implicit class ParamsResourceProjectsDatabasesDocumentsCommitOps[Self <: ParamsResourceProjectsDatabasesDocumentsCommit] (val x: Self) extends AnyVal {
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
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaCommitRequest): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

