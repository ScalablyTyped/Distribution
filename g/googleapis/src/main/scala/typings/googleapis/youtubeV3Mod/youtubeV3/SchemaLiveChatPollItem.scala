package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatPollItem extends StObject {
  
  /**
    * Plain text description of the item.
    */
  var description: js.UndefOr[String] = js.undefined
  
  var itemId: js.UndefOr[String] = js.undefined
}
object SchemaLiveChatPollItem {
  
  inline def apply(): SchemaLiveChatPollItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatPollItem]
  }
  
  extension [Self <: SchemaLiveChatPollItem](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
  }
}
