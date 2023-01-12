package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  /** An embed represents an external entity. See go/es-embeds. */
  var embedItem: js.UndefOr[EmbedClientItem] = js.undefined
  
  /** An id to uniquely identify an attachment when several attachments are in a collection. */
  var id: js.UndefOr[String] = js.undefined
}
object Attachment {
  
  inline def apply(): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
    
    inline def setEmbedItem(value: EmbedClientItem): Self = StObject.set(x, "embedItem", value.asInstanceOf[js.Any])
    
    inline def setEmbedItemUndefined: Self = StObject.set(x, "embedItem", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
