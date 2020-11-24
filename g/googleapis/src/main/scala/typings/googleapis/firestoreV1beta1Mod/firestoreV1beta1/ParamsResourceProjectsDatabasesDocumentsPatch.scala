package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsDatabasesDocumentsPatch extends StandardParameters {
  
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
    * The list of field paths in the mask. See Document.fields for a field path
    * syntax reference.
    */
  @JSName("mask.fieldPaths")
  var maskDotfieldPaths: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The resource name of the document, for example
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDocument] = js.native
  
  /**
    * The list of field paths in the mask. See Document.fields for a field path
    * syntax reference.
    */
  @JSName("updateMask.fieldPaths")
  var updateMaskDotfieldPaths: js.UndefOr[js.Array[String]] = js.native
}
object ParamsResourceProjectsDatabasesDocumentsPatch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsDatabasesDocumentsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesDocumentsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsDatabasesDocumentsPatchOps[Self <: ParamsResourceProjectsDatabasesDocumentsPatch] (val x: Self) extends AnyVal {
    
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
    def setRequestBody(value: SchemaDocument): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMaskDotfieldPathsVarargs(value: String*): Self = this.set("updateMask.fieldPaths", js.Array(value :_*))
    
    @scala.inline
    def setUpdateMaskDotfieldPaths(value: js.Array[String]): Self = this.set("updateMask.fieldPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMaskDotfieldPaths: Self = this.set("updateMask.fieldPaths", js.undefined)
  }
}
