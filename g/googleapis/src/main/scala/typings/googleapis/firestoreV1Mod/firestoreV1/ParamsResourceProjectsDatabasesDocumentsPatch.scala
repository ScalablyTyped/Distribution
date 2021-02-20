package typings.googleapis.firestoreV1Mod.firestoreV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
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
  implicit class ParamsResourceProjectsDatabasesDocumentsPatchMutableBuilder[Self <: ParamsResourceProjectsDatabasesDocumentsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCurrentDocumentDotexists(value: Boolean): Self = StObject.set(x, "currentDocument.exists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDocumentDotexistsUndefined: Self = StObject.set(x, "currentDocument.exists", js.undefined)
    
    @scala.inline
    def setCurrentDocumentDotupdateTime(value: String): Self = StObject.set(x, "currentDocument.updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDocumentDotupdateTimeUndefined: Self = StObject.set(x, "currentDocument.updateTime", js.undefined)
    
    @scala.inline
    def setMaskDotfieldPaths(value: js.Array[String]): Self = StObject.set(x, "mask.fieldPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskDotfieldPathsUndefined: Self = StObject.set(x, "mask.fieldPaths", js.undefined)
    
    @scala.inline
    def setMaskDotfieldPathsVarargs(value: String*): Self = StObject.set(x, "mask.fieldPaths", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaDocument): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMaskDotfieldPaths(value: js.Array[String]): Self = StObject.set(x, "updateMask.fieldPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskDotfieldPathsUndefined: Self = StObject.set(x, "updateMask.fieldPaths", js.undefined)
    
    @scala.inline
    def setUpdateMaskDotfieldPathsVarargs(value: String*): Self = StObject.set(x, "updateMask.fieldPaths", js.Array(value :_*))
  }
}
