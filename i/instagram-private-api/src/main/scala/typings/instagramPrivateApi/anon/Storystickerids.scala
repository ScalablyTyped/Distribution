package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Storystickerids extends StObject {
  
  var story_sticker_ids: js.Any
}
object Storystickerids {
  
  inline def apply(story_sticker_ids: js.Any): Storystickerids = {
    val __obj = js.Dynamic.literal(story_sticker_ids = story_sticker_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Storystickerids]
  }
  
  extension [Self <: Storystickerids](x: Self) {
    
    inline def setStory_sticker_ids(value: js.Any): Self = StObject.set(x, "story_sticker_ids", value.asInstanceOf[js.Any])
  }
}
