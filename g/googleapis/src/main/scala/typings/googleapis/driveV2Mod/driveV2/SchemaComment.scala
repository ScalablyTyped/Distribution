package typings.googleapis.driveV2Mod.driveV2

import typings.googleapis.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A comment on a file in Google Drive.
  */
@js.native
trait SchemaComment extends js.Object {
  
  /**
    * A region of the document represented as a JSON string. See anchor
    * documentation for details on how to define and interpret anchor
    * properties.
    */
  var anchor: js.UndefOr[String] = js.native
  
  /**
    * The user who wrote this comment.
    */
  var author: js.UndefOr[SchemaUser] = js.native
  
  /**
    * The ID of the comment.
    */
  var commentId: js.UndefOr[String] = js.native
  
  /**
    * The plain text content used to create this comment. This is not HTML safe
    * and should only be used as a starting point to make edits to a
    * comment&#39;s content.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * The context of the file which is being commented on.
    */
  var context: js.UndefOr[Value] = js.native
  
  /**
    * The date when this comment was first created.
    */
  var createdDate: js.UndefOr[String] = js.native
  
  /**
    * Whether this comment has been deleted. If a comment has been deleted the
    * content will be cleared and this will only represent a comment that once
    * existed.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * The file which this comment is addressing.
    */
  var fileId: js.UndefOr[String] = js.native
  
  /**
    * The title of the file which this comment is addressing.
    */
  var fileTitle: js.UndefOr[String] = js.native
  
  /**
    * HTML formatted content for this comment.
    */
  var htmlContent: js.UndefOr[String] = js.native
  
  /**
    * This is always drive#comment.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The date when this comment or any of its replies were last modified.
    */
  var modifiedDate: js.UndefOr[String] = js.native
  
  /**
    * Replies to this post.
    */
  var replies: js.UndefOr[js.Array[SchemaCommentReply]] = js.native
  
  /**
    * A link back to this comment.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * The status of this comment. Status can be changed by posting a reply to a
    * comment with the desired status.   - &quot;open&quot; - The comment is
    * still open.  - &quot;resolved&quot; - The comment has been resolved by
    * one of its replies.
    */
  var status: js.UndefOr[String] = js.native
}
object SchemaComment {
  
  @scala.inline
  def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  
  @scala.inline
  implicit class SchemaCommentOps[Self <: SchemaComment] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: String): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setAuthor(value: SchemaUser): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setCommentId(value: String): Self = this.set("commentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentId: Self = this.set("commentId", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContext(value: Value): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileId: Self = this.set("fileId", js.undefined)
    
    @scala.inline
    def setFileTitle(value: String): Self = this.set("fileTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileTitle: Self = this.set("fileTitle", js.undefined)
    
    @scala.inline
    def setHtmlContent(value: String): Self = this.set("htmlContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlContent: Self = this.set("htmlContent", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setModifiedDate(value: String): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedDate: Self = this.set("modifiedDate", js.undefined)
    
    @scala.inline
    def setRepliesVarargs(value: SchemaCommentReply*): Self = this.set("replies", js.Array(value :_*))
    
    @scala.inline
    def setReplies(value: js.Array[SchemaCommentReply]): Self = this.set("replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
