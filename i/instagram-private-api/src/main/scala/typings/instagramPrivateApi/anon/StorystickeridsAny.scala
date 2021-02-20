package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorystickeridsAny extends StObject {
  
  var story_sticker_ids: js.Any = js.native
}
object StorystickeridsAny {
  
  @scala.inline
  def apply(story_sticker_ids: js.Any): StorystickeridsAny = {
    val __obj = js.Dynamic.literal(story_sticker_ids = story_sticker_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorystickeridsAny]
  }
  
  @scala.inline
  implicit class StorystickeridsAnyMutableBuilder[Self <: StorystickeridsAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStory_sticker_ids(value: js.Any): Self = StObject.set(x, "story_sticker_ids", value.asInstanceOf[js.Any])
  }
}
