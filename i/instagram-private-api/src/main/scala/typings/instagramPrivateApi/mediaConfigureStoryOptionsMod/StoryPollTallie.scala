package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryPollTallie extends StObject {
  
  var count: `0` = js.native
  
  var font_size: Double = js.native
  
  var text: String = js.native
}
object StoryPollTallie {
  
  @scala.inline
  def apply(count: `0`, font_size: Double, text: String): StoryPollTallie = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], font_size = font_size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryPollTallie]
  }
  
  @scala.inline
  implicit class StoryPollTallieMutableBuilder[Self <: StoryPollTallie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: `0`): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont_size(value: Double): Self = StObject.set(x, "font_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
