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
  
  @scala.inline
  def apply(): SchemaLiveChatPollItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatPollItem]
  }
  
  @scala.inline
  implicit class SchemaLiveChatPollItemMutableBuilder[Self <: SchemaLiveChatPollItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
  }
}
