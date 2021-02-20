package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ParamsResourceProjectsDatabasesDocumentsDeleteMutableBuilder[Self <: ParamsResourceProjectsDatabasesDocumentsDelete] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
