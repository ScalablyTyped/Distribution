package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A comment on a file in Google Drive.
  */
trait SchemaCommentReply extends StObject {
  
  /**
    * The user who wrote this reply.
    */
  var author: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * The plain text content used to create this reply. This is not HTML safe
    * and should only be used as a starting point to make edits to a
    * reply&#39;s content. This field is required on inserts if no verb is
    * specified (resolve/reopen).
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The date when this reply was first created.
    */
  var createdDate: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this reply has been deleted. If a reply has been deleted the
    * content will be cleared and this will only represent a reply that once
    * existed.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * HTML formatted content for this reply.
    */
  var htmlContent: js.UndefOr[String] = js.undefined
  
  /**
    * This is always drive#commentReply.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The date when this reply was last modified.
    */
  var modifiedDate: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the reply.
    */
  var replyId: js.UndefOr[String] = js.undefined
  
  /**
    * The action this reply performed to the parent comment. When creating a
    * new reply this is the action to be perform to the parent comment.
    * Possible values are:   - &quot;resolve&quot; - To resolve a comment.  -
    * &quot;reopen&quot; - To reopen (un-resolve) a comment.
    */
  var verb: js.UndefOr[String] = js.undefined
}
object SchemaCommentReply {
  
  inline def apply(): SchemaCommentReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentReply]
  }
  
  extension [Self <: SchemaCommentReply](x: Self) {
    
    inline def setAuthor(value: SchemaUser): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setHtmlContent(value: String): Self = StObject.set(x, "htmlContent", value.asInstanceOf[js.Any])
    
    inline def setHtmlContentUndefined: Self = StObject.set(x, "htmlContent", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
    
    inline def setReplyId(value: String): Self = StObject.set(x, "replyId", value.asInstanceOf[js.Any])
    
    inline def setReplyIdUndefined: Self = StObject.set(x, "replyId", js.undefined)
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
  }
}
