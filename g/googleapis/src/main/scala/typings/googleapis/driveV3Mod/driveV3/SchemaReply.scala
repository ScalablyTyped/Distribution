package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reply to a comment on a file.
  */
trait SchemaReply extends StObject {
  
  /**
    * The action the reply performed to the parent comment. Valid values are:
    * - resolve  - reopen
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * The user who created the reply.
    */
  var author: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * The plain text content of the reply. This field is used for setting the
    * content, while htmlContent should be displayed. This is required on
    * creates if no action is specified.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the reply was created (RFC 3339 date-time).
    */
  var createdTime: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the reply has been deleted. A deleted reply has no content.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content of the reply with HTML formatting.
    */
  var htmlContent: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the reply.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#reply&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The last time the reply was modified (RFC 3339 date-time).
    */
  var modifiedTime: js.UndefOr[String] = js.undefined
}
object SchemaReply {
  
  @scala.inline
  def apply(): SchemaReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReply]
  }
  
  @scala.inline
  implicit class SchemaReplyMutableBuilder[Self <: SchemaReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
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
  }
}
