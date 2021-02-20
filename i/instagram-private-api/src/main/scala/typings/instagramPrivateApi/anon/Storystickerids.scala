package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Storystickerids extends StObject {
  
  var story_sticker_ids: String = js.native
}
object Storystickerids {
  
  @scala.inline
  def apply(story_sticker_ids: String): Storystickerids = {
    val __obj = js.Dynamic.literal(story_sticker_ids = story_sticker_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Storystickerids]
  }
  
  @scala.inline
  implicit class StorystickeridsMutableBuilder[Self <: Storystickerids] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStory_sticker_ids(value: String): Self = StObject.set(x, "story_sticker_ids", value.asInstanceOf[js.Any])
  }
}
