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
trait ParamsResourceProjectsDatabasesDocumentsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The collection ID, relative to `parent`, to list. For example:
    * `chatrooms` or `messages`.
    */
  var collectionId: js.UndefOr[String] = js.native
  
  /**
    * The list of field paths in the mask. See Document.fields for a field path
    * syntax reference.
    */
  @JSName("mask.fieldPaths")
  var maskDotfieldPaths: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The order to sort results by. For example: `priority desc, name`.
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of documents to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The `next_page_token` value returned from a previous List request, if
    * any.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The parent resource name. In the format:
    * `projects/{project_id}/databases/{database_id}/documents` or
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * For example: `projects/my-project/databases/my-database/documents` or
    * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Reads documents as they were at the given time. This may not be older
    * than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.native
  
  /**
    * If the list should show missing documents. A missing document is a
    * document that does not exist but has sub-documents. These documents will
    * be returned with a key but will not have fields, Document.create_time, or
    * Document.update_time set.  Requests with `show_missing` may not specify
    * `where` or `order_by`.
    */
  var showMissing: js.UndefOr[Boolean] = js.native
  
  /**
    * Reads documents in a transaction.
    */
  var transaction: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsDatabasesDocumentsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsDatabasesDocumentsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesDocumentsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsDatabasesDocumentsListMutableBuilder[Self <: ParamsResourceProjectsDatabasesDocumentsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionIdUndefined: Self = StObject.set(x, "collectionId", js.undefined)
    
    @scala.inline
    def setMaskDotfieldPaths(value: js.Array[String]): Self = StObject.set(x, "mask.fieldPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskDotfieldPathsUndefined: Self = StObject.set(x, "mask.fieldPaths", js.undefined)
    
    @scala.inline
    def setMaskDotfieldPathsVarargs(value: String*): Self = StObject.set(x, "mask.fieldPaths", js.Array(value :_*))
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    @scala.inline
    def setShowMissing(value: Boolean): Self = StObject.set(x, "showMissing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMissingUndefined: Self = StObject.set(x, "showMissing", js.undefined)
    
    @scala.inline
    def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
