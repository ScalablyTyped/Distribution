package typings.googleapis.firestoreV1Mod.firestoreV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsDatabasesDocumentsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * When set to `true`, the target document must exist. When set to `false`,
    * the target document must not exist.
    */
  @JSName("currentDocument.exists")
  var currentDocumentDotexists: js.UndefOr[Boolean] = js.native
  /**
    * When set, the target document must exist and have been last updated at
    * that time.
    */
  @JSName("currentDocument.updateTime")
  var currentDocumentDotupdateTime: js.UndefOr[String] = js.native
  /**
    * The resource name of the Document to delete. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var name: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsDatabasesDocumentsDelete {
  @scala.inline
  def apply(): ParamsResourceProjectsDatabasesDocumentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesDocumentsDelete]
  }
  @scala.inline
  implicit class ParamsResourceProjectsDatabasesDocumentsDeleteOps[Self <: ParamsResourceProjectsDatabasesDocumentsDelete] (val x: Self) extends AnyVal {
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
    def setCurrentDocumentDotexists(value: Boolean): Self = this.set("currentDocument.exists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentDocumentDotexists: Self = this.set("currentDocument.exists", js.undefined)
    @scala.inline
    def setCurrentDocumentDotupdateTime(value: String): Self = this.set("currentDocument.updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentDocumentDotupdateTime: Self = this.set("currentDocument.updateTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

