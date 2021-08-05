package typings.googleapis.driveV2Mod.driveV2

import typings.googleapis.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A comment on a file in Google Drive.
  */
trait SchemaComment extends StObject {
  
  /**
    * A region of the document represented as a JSON string. See anchor
    * documentation for details on how to define and interpret anchor
    * properties.
    */
  var anchor: js.UndefOr[String] = js.undefined
  
  /**
    * The user who wrote this comment.
    */
  var author: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * The ID of the comment.
    */
  var commentId: js.UndefOr[String] = js.undefined
  
  /**
    * The plain text content used to create this comment. This is not HTML safe
    * and should only be used as a starting point to make edits to a
    * comment&#39;s content.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The context of the file which is being commented on.
    */
  var context: js.UndefOr[Value] = js.undefined
  
  /**
    * The date when this comment was first created.
    */
  var createdDate: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this comment has been deleted. If a comment has been deleted the
    * content will be cleared and this will only represent a comment that once
    * existed.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The file which this comment is addressing.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the file which this comment is addressing.
    */
  var fileTitle: js.UndefOr[String] = js.undefined
  
  /**
    * HTML formatted content for this comment.
    */
  var htmlContent: js.UndefOr[String] = js.undefined
  
  /**
    * This is always drive#comment.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The date when this comment or any of its replies were last modified.
    */
  var modifiedDate: js.UndefOr[String] = js.undefined
  
  /**
    * Replies to this post.
    */
  var replies: js.UndefOr[js.Array[SchemaCommentReply]] = js.undefined
  
  /**
    * A link back to this comment.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The status of this comment. Status can be changed by posting a reply to a
    * comment with the desired status.   - &quot;open&quot; - The comment is
    * still open.  - &quot;resolved&quot; - The comment has been resolved by
    * one of its replies.
    */
  var status: js.UndefOr[String] = js.undefined
}
object SchemaComment {
  
  inline def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  
  extension [Self <: SchemaComment](x: Self) {
    
    inline def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setAuthor(value: SchemaUser): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCommentId(value: String): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    inline def setCommentIdUndefined: Self = StObject.set(x, "commentId", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContext(value: Value): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setFileTitle(value: String): Self = StObject.set(x, "fileTitle", value.asInstanceOf[js.Any])
    
    inline def setFileTitleUndefined: Self = StObject.set(x, "fileTitle", js.undefined)
    
    inline def setHtmlContent(value: String): Self = StObject.set(x, "htmlContent", value.asInstanceOf[js.Any])
    
    inline def setHtmlContentUndefined: Self = StObject.set(x, "htmlContent", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
    
    inline def setReplies(value: js.Array[SchemaCommentReply]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    inline def setRepliesVarargs(value: SchemaCommentReply*): Self = StObject.set(x, "replies", js.Array(value :_*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
