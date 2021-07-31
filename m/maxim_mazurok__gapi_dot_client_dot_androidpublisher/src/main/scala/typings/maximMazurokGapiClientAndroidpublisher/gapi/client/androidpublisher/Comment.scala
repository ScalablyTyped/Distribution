package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  /** A comment from a developer. */
  var developerComment: js.UndefOr[DeveloperComment] = js.undefined
  
  /** A comment from a user. */
  var userComment: js.UndefOr[UserComment] = js.undefined
}
object Comment {
  
  @scala.inline
  def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperComment(value: DeveloperComment): Self = StObject.set(x, "developerComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperCommentUndefined: Self = StObject.set(x, "developerComment", js.undefined)
    
    @scala.inline
    def setUserComment(value: UserComment): Self = StObject.set(x, "userComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCommentUndefined: Self = StObject.set(x, "userComment", js.undefined)
  }
}
