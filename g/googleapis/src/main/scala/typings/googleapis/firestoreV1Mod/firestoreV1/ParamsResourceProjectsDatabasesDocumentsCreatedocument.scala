package typings.googleapis.firestoreV1Mod.firestoreV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatabasesDocumentsCreatedocument
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The collection ID, relative to `parent`, to list. For example:
    * `chatrooms`.
    */
  var collectionId: js.UndefOr[String] = js.undefined
  
  /**
    * The client-assigned document ID to use for this document.  Optional. If
    * not specified, an ID will be assigned by the service.
    */
  var documentId: js.UndefOr[String] = js.undefined
  
  /**
    * The list of field paths in the mask. See Document.fields for a field path
    * syntax reference.
    */
  @JSName("mask.fieldPaths")
  var maskDotfieldPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The parent resource. For example:
    * `projects/{project_id}/databases/{database_id}/documents` or
    * `projects/{project_id}/databases/{database_id}/documents/chatrooms/{chatroom_id}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDocument] = js.undefined
}
object ParamsResourceProjectsDatabasesDocumentsCreatedocument {
  
  @scala.inline
  def apply(): ParamsResourceProjectsDatabasesDocumentsCreatedocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesDocumentsCreatedocument]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsDatabasesDocumentsCreatedocumentMutableBuilder[Self <: ParamsResourceProjectsDatabasesDocumentsCreatedocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionIdUndefined: Self = StObject.set(x, "collectionId", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setMaskDotfieldPaths(value: js.Array[String]): Self = StObject.set(x, "mask.fieldPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskDotfieldPathsUndefined: Self = StObject.set(x, "mask.fieldPaths", js.undefined)
    
    @scala.inline
    def setMaskDotfieldPathsVarargs(value: String*): Self = StObject.set(x, "mask.fieldPaths", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaDocument): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
