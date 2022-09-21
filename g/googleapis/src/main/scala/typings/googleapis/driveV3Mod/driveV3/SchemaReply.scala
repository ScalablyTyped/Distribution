package typings.googleapis.driveV3Mod.driveV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReply extends StObject {
  
  /**
    * The action the reply performed to the parent comment. Valid values are:
    * - resolve
    * - reopen
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The author of the reply. The author's email address and permission ID will not be populated.
    */
  var author: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * The plain text content of the reply. This field is used for setting the content, while htmlContent should be displayed. This is required on creates if no action is specified.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the reply was created (RFC 3339 date-time).
    */
  var createdTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the reply has been deleted. A deleted reply has no content.
    */
  var deleted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The content of the reply with HTML formatting.
    */
  var htmlContent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the reply.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "drive#reply".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last time the reply was modified (RFC 3339 date-time).
    */
  var modifiedTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaReply {
  
  inline def apply(): SchemaReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReply]
  }
  
  extension [Self <: SchemaReply](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
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
  }
}
