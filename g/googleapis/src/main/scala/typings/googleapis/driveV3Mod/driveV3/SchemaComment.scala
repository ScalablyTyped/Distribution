package typings.googleapis.driveV3Mod.driveV3

import typings.googleapis.anon.MimeTypeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A comment on a file.
  */
@js.native
trait SchemaComment extends StObject {
  
  /**
    * A region of the document represented as a JSON string. See anchor
    * documentation for details on how to define and interpret anchor
    * properties.
    */
  var anchor: js.UndefOr[String] = js.native
  
  /**
    * The user who created the comment.
    */
  var author: js.UndefOr[SchemaUser] = js.native
  
  /**
    * The plain text content of the comment. This field is used for setting the
    * content, while htmlContent should be displayed.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * The time at which the comment was created (RFC 3339 date-time).
    */
  var createdTime: js.UndefOr[String] = js.native
  
  /**
    * Whether the comment has been deleted. A deleted comment has no content.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * The content of the comment with HTML formatting.
    */
  var htmlContent: js.UndefOr[String] = js.native
  
  /**
    * The ID of the comment.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#comment&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The last time the comment or any of its replies was modified (RFC 3339
    * date-time).
    */
  var modifiedTime: js.UndefOr[String] = js.native
  
  /**
    * The file content to which the comment refers, typically within the anchor
    * region. For a text file, for example, this would be the text at the
    * location of the comment.
    */
  var quotedFileContent: js.UndefOr[MimeTypeValue] = js.native
  
  /**
    * The full list of replies to the comment in chronological order.
    */
  var replies: js.UndefOr[js.Array[SchemaReply]] = js.native
  
  /**
    * Whether the comment has been resolved by one of its replies.
    */
  var resolved: js.UndefOr[Boolean] = js.native
}
object SchemaComment {
  
  @scala.inline
  def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  
  @scala.inline
  implicit class SchemaCommentMutableBuilder[Self <: SchemaComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setAuthor(value: SchemaUser): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: String): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setHtmlContent(value: String): Self = StObject.set(x, "htmlContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlContentUndefined: Self = StObject.set(x, "htmlContent", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setModifiedTime(value: String): Self = StObject.set(x, "modifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedTimeUndefined: Self = StObject.set(x, "modifiedTime", js.undefined)
    
    @scala.inline
    def setQuotedFileContent(value: MimeTypeValue): Self = StObject.set(x, "quotedFileContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotedFileContentUndefined: Self = StObject.set(x, "quotedFileContent", js.undefined)
    
    @scala.inline
    def setReplies(value: js.Array[SchemaReply]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setRepliesVarargs(value: SchemaReply*): Self = StObject.set(x, "replies", js.Array(value :_*))
    
    @scala.inline
    def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
  }
}
