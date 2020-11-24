package typings.googleapis.driveV3Mod.driveV3

import typings.googleapis.anon.MimeTypeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A comment on a file.
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: String): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setHtmlContent(value: String): Self = this.set("htmlContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlContent: Self = this.set("htmlContent", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setModifiedTime(value: String): Self = this.set("modifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedTime: Self = this.set("modifiedTime", js.undefined)
    
    @scala.inline
    def setQuotedFileContent(value: MimeTypeValue): Self = this.set("quotedFileContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotedFileContent: Self = this.set("quotedFileContent", js.undefined)
    
    @scala.inline
    def setRepliesVarargs(value: SchemaReply*): Self = this.set("replies", js.Array(value :_*))
    
    @scala.inline
    def setReplies(value: js.Array[SchemaReply]): Self = this.set("replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
    
    @scala.inline
    def setResolved(value: Boolean): Self = this.set("resolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolved: Self = this.set("resolved", js.undefined)
  }
}
