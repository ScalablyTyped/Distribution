package typings.googleapis.driveV3Mod.driveV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCommentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the comment.
    */
  var commentId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the file.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to return deleted comments. Deleted comments will not include
    * their original content.
    */
  var includeDeleted: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceCommentsGet {
  
  @scala.inline
  def apply(): ParamsResourceCommentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceCommentsGetMutableBuilder[Self <: ParamsResourceCommentsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCommentId(value: String): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentIdUndefined: Self = StObject.set(x, "commentId", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    @scala.inline
    def setIncludeDeleted(value: Boolean): Self = StObject.set(x, "includeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeletedUndefined: Self = StObject.set(x, "includeDeleted", js.undefined)
  }
}
