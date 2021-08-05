package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiBooleans.`false`
import typings.instagramPrivateApi.instagramPrivateApiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryChat
  extends StObject
     with StorySticker {
  
  var end_background_color: String
  
  var has_started_chat: `false`
  
  var is_sticker: `true`
  
  var start_background_color: String
  
  var text: String
}
object StoryChat {
  
  inline def apply(
    end_background_color: String,
    height: Double,
    rotation: Double,
    start_background_color: String,
    text: String,
    width: Double,
    x: Double,
    y: Double
  ): StoryChat = {
    val __obj = js.Dynamic.literal(end_background_color = end_background_color.asInstanceOf[js.Any], has_started_chat = false, height = height.asInstanceOf[js.Any], is_sticker = true, rotation = rotation.asInstanceOf[js.Any], start_background_color = start_background_color.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryChat]
  }
  
  extension [Self <: StoryChat](x: Self) {
    
    inline def setEnd_background_color(value: String): Self = StObject.set(x, "end_background_color", value.asInstanceOf[js.Any])
    
    inline def setHas_started_chat(value: `false`): Self = StObject.set(x, "has_started_chat", value.asInstanceOf[js.Any])
    
    inline def setIs_sticker(value: `true`): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
    
    inline def setStart_background_color(value: String): Self = StObject.set(x, "start_background_color", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
