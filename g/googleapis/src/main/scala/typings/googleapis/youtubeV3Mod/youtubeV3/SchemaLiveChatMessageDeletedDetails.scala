package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatMessageDeletedDetails extends StObject {
  
  var deletedMessageId: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiveChatMessageDeletedDetails {
  
  inline def apply(): SchemaLiveChatMessageDeletedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatMessageDeletedDetails]
  }
  
  extension [Self <: SchemaLiveChatMessageDeletedDetails](x: Self) {
    
    inline def setDeletedMessageId(value: String): Self = StObject.set(x, "deletedMessageId", value.asInstanceOf[js.Any])
    
    inline def setDeletedMessageIdNull: Self = StObject.set(x, "deletedMessageId", null)
    
    inline def setDeletedMessageIdUndefined: Self = StObject.set(x, "deletedMessageId", js.undefined)
  }
}
