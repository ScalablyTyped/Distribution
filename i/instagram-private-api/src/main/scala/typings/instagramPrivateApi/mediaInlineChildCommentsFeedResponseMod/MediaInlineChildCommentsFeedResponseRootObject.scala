package typings.instagramPrivateApi.mediaInlineChildCommentsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaInlineChildCommentsFeedResponseRootObject extends js.Object {
  
  var child_comment_count: Double = js.native
  
  var child_comments: js.Array[MediaInlineChildCommentsFeedResponseChildCommentsItem] = js.native
  
  var has_more_head_child_comments: Boolean = js.native
  
  var has_more_tail_child_comments: Boolean = js.native
  
  var next_max_child_cursor: String = js.native
  
  var num_tail_child_comments: Double = js.native
  
  var parent_comment: MediaInlineChildCommentsFeedResponseParentComment = js.native
  
  var status: String = js.native
}
object MediaInlineChildCommentsFeedResponseRootObject {
  
  @scala.inline
  def apply(
    child_comment_count: Double,
    child_comments: js.Array[MediaInlineChildCommentsFeedResponseChildCommentsItem],
    has_more_head_child_comments: Boolean,
    has_more_tail_child_comments: Boolean,
    next_max_child_cursor: String,
    num_tail_child_comments: Double,
    parent_comment: MediaInlineChildCommentsFeedResponseParentComment,
    status: String
  ): MediaInlineChildCommentsFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(child_comment_count = child_comment_count.asInstanceOf[js.Any], child_comments = child_comments.asInstanceOf[js.Any], has_more_head_child_comments = has_more_head_child_comments.asInstanceOf[js.Any], has_more_tail_child_comments = has_more_tail_child_comments.asInstanceOf[js.Any], next_max_child_cursor = next_max_child_cursor.asInstanceOf[js.Any], num_tail_child_comments = num_tail_child_comments.asInstanceOf[js.Any], parent_comment = parent_comment.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaInlineChildCommentsFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class MediaInlineChildCommentsFeedResponseRootObjectOps[Self <: MediaInlineChildCommentsFeedResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setChild_comment_count(value: Double): Self = this.set("child_comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChild_commentsVarargs(value: MediaInlineChildCommentsFeedResponseChildCommentsItem*): Self = this.set("child_comments", js.Array(value :_*))
    
    @scala.inline
    def setChild_comments(value: js.Array[MediaInlineChildCommentsFeedResponseChildCommentsItem]): Self = this.set("child_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_head_child_comments(value: Boolean): Self = this.set("has_more_head_child_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_tail_child_comments(value: Boolean): Self = this.set("has_more_tail_child_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_child_cursor(value: String): Self = this.set("next_max_child_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_tail_child_comments(value: Double): Self = this.set("num_tail_child_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_comment(value: MediaInlineChildCommentsFeedResponseParentComment): Self = this.set("parent_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
