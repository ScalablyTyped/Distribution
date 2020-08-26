package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsDatabasesDocumentsCreatedocument extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The collection ID, relative to `parent`, to list. For example:
    * `chatrooms`.
    */
  var collectionId: js.UndefOr[String] = js.native
  /**
    * The client-assigned document ID to use for this document.  Optional. If
    * not specified, an ID will be assigned by the service.
    */
  var documentId: js.UndefOr[String] = js.native
  /**
    * The list of field paths in the mask. See Document.fields for a field path
    * syntax reference.
    */
  @JSName("mask.fieldPaths")
  var maskDotfieldPaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * The parent resource. For example:
    * `projects/{project_id}/databases/{database_id}/documents` or
    * `projects/{project_id}/databases/{database_id}/documents/chatrooms/{chatroom_id}`
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDocument] = js.native
}

object ParamsResourceProjectsDatabasesDocumentsCreatedocument {
  @scala.inline
  def apply(): ParamsResourceProjectsDatabasesDocumentsCreatedocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesDocumentsCreatedocument]
  }
  @scala.inline
  implicit class ParamsResourceProjectsDatabasesDocumentsCreatedocumentOps[Self <: ParamsResourceProjectsDatabasesDocumentsCreatedocument] (val x: Self) extends AnyVal {
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
    def setCollectionId(value: String): Self = this.set("collectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionId: Self = this.set("collectionId", js.undefined)
    @scala.inline
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
    @scala.inline
    def setMaskDotfieldPathsVarargs(value: String*): Self = this.set("mask.fieldPaths", js.Array(value :_*))
    @scala.inline
    def setMaskDotfieldPaths(value: js.Array[String]): Self = this.set("mask.fieldPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskDotfieldPaths: Self = this.set("mask.fieldPaths", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaDocument): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

