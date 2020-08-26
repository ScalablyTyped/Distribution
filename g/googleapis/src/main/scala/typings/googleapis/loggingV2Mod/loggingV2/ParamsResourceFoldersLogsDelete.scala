package typings.googleapis.loggingV2Mod.loggingV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceFoldersLogsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The resource name of the log to delete:
    * "projects/[PROJECT_ID]/logs/[LOG_ID]"
    * "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
    * "folders/[FOLDER_ID]/logs/[LOG_ID]" [LOG_ID] must be URL-encoded. For
    * example, "projects/my-project-id/logs/syslog",
    * "organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity".
    * For more information about log names, see LogEntry.
    */
  var logName: js.UndefOr[String] = js.native
}

object ParamsResourceFoldersLogsDelete {
  @scala.inline
  def apply(): ParamsResourceFoldersLogsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersLogsDelete]
  }
  @scala.inline
  implicit class ParamsResourceFoldersLogsDeleteOps[Self <: ParamsResourceFoldersLogsDelete] (val x: Self) extends AnyVal {
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
    def setLogName(value: String): Self = this.set("logName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogName: Self = this.set("logName", js.undefined)
  }
  
}

