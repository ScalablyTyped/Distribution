package typings.googleapis.driveV3Mod.driveV3

import typings.googleapis.anon.MimeTypeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComment extends StObject {
  
  /**
    * A region of the document represented as a JSON string. For details on defining anchor properties, refer to  Add comments and replies.
    */
  var anchor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The author of the comment. The author's email address and permission ID will not be populated.
    */
  var author: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * The plain text content of the comment. This field is used for setting the content, while htmlContent should be displayed.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the comment was created (RFC 3339 date-time).
    */
  var createdTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the comment has been deleted. A deleted comment has no content.
    */
  var deleted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The content of the comment with HTML formatting.
    */
  var htmlContent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the comment.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "drive#comment".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last time the comment or any of its replies was modified (RFC 3339 date-time).
    */
  var modifiedTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The file content to which the comment refers, typically within the anchor region. For a text file, for example, this would be the text at the location of the comment.
    */
  var quotedFileContent: js.UndefOr[MimeTypeValue | Null] = js.undefined
  
  /**
    * The full list of replies to the comment in chronological order.
    */
  var replies: js.UndefOr[js.Array[SchemaReply]] = js.undefined
  
  /**
    * Whether the comment has been resolved by one of its replies.
    */
  var resolved: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaComment {
  
  inline def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  
  extension [Self <: SchemaComment](x: Self) {
    
    inline def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setAuthor(value: SchemaUser): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreatedTime(value: String): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeNull: Self = StObject.set(x, "createdTime", null)
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setHtmlContent(value: String): Self = StObject.set(x, "htmlContent", value.asInstanceOf[js.Any])
    
    inline def setHtmlContentNull: Self = StObject.set(x, "htmlContent", null)
    
    inline def setHtmlContentUndefined: Self = StObject.set(x, "htmlContent", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setModifiedTime(value: String): Self = StObject.set(x, "modifiedTime", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimeNull: Self = StObject.set(x, "modifiedTime", null)
    
    inline def setModifiedTimeUndefined: Self = StObject.set(x, "modifiedTime", js.undefined)
    
    inline def setQuotedFileContent(value: MimeTypeValue): Self = StObject.set(x, "quotedFileContent", value.asInstanceOf[js.Any])
    
    inline def setQuotedFileContentNull: Self = StObject.set(x, "quotedFileContent", null)
    
    inline def setQuotedFileContentUndefined: Self = StObject.set(x, "quotedFileContent", js.undefined)
    
    inline def setReplies(value: js.Array[SchemaReply]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    inline def setRepliesVarargs(value: SchemaReply*): Self = StObject.set(x, "replies", js.Array(value*))
    
    inline def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedNull: Self = StObject.set(x, "resolved", null)
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
  }
}
