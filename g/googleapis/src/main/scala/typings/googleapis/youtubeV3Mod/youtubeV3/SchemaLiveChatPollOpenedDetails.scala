package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatPollOpenedDetails extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[SchemaLiveChatPollItem]] = js.undefined
  
  var prompt: js.UndefOr[String] = js.undefined
}
object SchemaLiveChatPollOpenedDetails {
  
  inline def apply(): SchemaLiveChatPollOpenedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatPollOpenedDetails]
  }
  
  extension [Self <: SchemaLiveChatPollOpenedDetails](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItems(value: js.Array[SchemaLiveChatPollItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaLiveChatPollItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
  }
}
