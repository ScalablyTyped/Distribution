package typings.googleapis.driveV3Mod.driveV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRepliesUpdate
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
    * The ID of the reply.
    */
  var replyId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReply] = js.undefined
}
object ParamsResourceRepliesUpdate {
  
  @scala.inline
  def apply(): ParamsResourceRepliesUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRepliesUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceRepliesUpdateMutableBuilder[Self <: ParamsResourceRepliesUpdate] (val x: Self) extends AnyVal {
    
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
    def setReplyId(value: String): Self = StObject.set(x, "replyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyIdUndefined: Self = StObject.set(x, "replyId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaReply): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
