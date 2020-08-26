package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsDatabasesDocumentsGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The list of field paths in the mask. See Document.fields for a field path
    * syntax reference.
    */
  @JSName("mask.fieldPaths")
  var maskDotfieldPaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * The resource name of the Document to get. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Reads the version of the document at the given time. This may not be
    * older than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * Reads the document in a transaction.
    */
  var transaction: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsDatabasesDocumentsGet {
  @scala.inline
  def apply(): ParamsResourceProjectsDatabasesDocumentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesDocumentsGet]
  }
  @scala.inline
  implicit class ParamsResourceProjectsDatabasesDocumentsGetOps[Self <: ParamsResourceProjectsDatabasesDocumentsGet] (val x: Self) extends AnyVal {
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
    def setMaskDotfieldPathsVarargs(value: String*): Self = this.set("mask.fieldPaths", js.Array(value :_*))
    @scala.inline
    def setMaskDotfieldPaths(value: js.Array[String]): Self = this.set("mask.fieldPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskDotfieldPaths: Self = this.set("mask.fieldPaths", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReadTime(value: String): Self = this.set("readTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadTime: Self = this.set("readTime", js.undefined)
    @scala.inline
    def setTransaction(value: String): Self = this.set("transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
  
}

