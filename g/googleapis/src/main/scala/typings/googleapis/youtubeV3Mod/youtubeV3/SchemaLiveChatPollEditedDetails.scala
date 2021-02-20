package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiveChatPollEditedDetails extends StObject {
  
  var id: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[js.Array[SchemaLiveChatPollItem]] = js.native
  
  var prompt: js.UndefOr[String] = js.native
}
object SchemaLiveChatPollEditedDetails {
  
  @scala.inline
  def apply(): SchemaLiveChatPollEditedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatPollEditedDetails]
  }
  
  @scala.inline
  implicit class SchemaLiveChatPollEditedDetailsMutableBuilder[Self <: SchemaLiveChatPollEditedDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaLiveChatPollItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaLiveChatPollItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
  }
}
