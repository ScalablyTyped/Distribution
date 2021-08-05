package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryPollTallie extends StObject {
  
  var count: `0`
  
  var font_size: Double
  
  var text: String
}
object StoryPollTallie {
  
  inline def apply(font_size: Double, text: String): StoryPollTallie = {
    val __obj = js.Dynamic.literal(count = 0, font_size = font_size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryPollTallie]
  }
  
  extension [Self <: StoryPollTallie](x: Self) {
    
    inline def setCount(value: `0`): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setFont_size(value: Double): Self = StObject.set(x, "font_size", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
