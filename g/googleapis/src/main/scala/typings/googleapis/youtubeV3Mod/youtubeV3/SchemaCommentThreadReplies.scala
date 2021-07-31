package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Comments written in (direct or indirect) reply to the top level comment.
  */
trait SchemaCommentThreadReplies extends StObject {
  
  /**
    * A limited number of replies. Unless the number of replies returned equals
    * total_reply_count in the snippet the returned replies are only a subset
    * of the total number of replies.
    */
  var comments: js.UndefOr[js.Array[SchemaComment]] = js.undefined
}
object SchemaCommentThreadReplies {
  
  @scala.inline
  def apply(): SchemaCommentThreadReplies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentThreadReplies]
  }
  
  @scala.inline
  implicit class SchemaCommentThreadRepliesMutableBuilder[Self <: SchemaCommentThreadReplies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[SchemaComment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: SchemaComment*): Self = StObject.set(x, "comments", js.Array(value :_*))
  }
}
