package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of Attachments. This is the response from the server to GET requests
  * on the attachments collection.
  */
trait SchemaAttachmentsListResponse extends StObject {
  
  /**
    * The list of attachments.
    */
  var items: js.UndefOr[js.Array[SchemaAttachment]] = js.undefined
  
  /**
    * The type of resource. This is always mirror#attachmentsList.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaAttachmentsListResponse {
  
  inline def apply(): SchemaAttachmentsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachmentsListResponse]
  }
  
  extension [Self <: SchemaAttachmentsListResponse](x: Self) {
    
    inline def setItems(value: js.Array[SchemaAttachment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaAttachment*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
