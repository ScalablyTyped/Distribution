package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSocialCommonAttachmentAttachment extends StObject {
  
  /**
    * An embed represents an external entity. See go/es-embeds.
    */
  var embedItem: js.UndefOr[SchemaEmbedClientItem] = js.undefined
  
  /**
    * An id to uniquely identify an attachment when several attachments are in a collection.
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaSocialCommonAttachmentAttachment {
  
  inline def apply(): SchemaSocialCommonAttachmentAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSocialCommonAttachmentAttachment]
  }
  
  extension [Self <: SchemaSocialCommonAttachmentAttachment](x: Self) {
    
    inline def setEmbedItem(value: SchemaEmbedClientItem): Self = StObject.set(x, "embedItem", value.asInstanceOf[js.Any])
    
    inline def setEmbedItemUndefined: Self = StObject.set(x, "embedItem", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
