package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryAttachedMedia
  extends StObject
     with StorySticker {
  
  var is_sticker: Boolean
  
  var media_id: String
}
object StoryAttachedMedia {
  
  inline def apply(
    height: Double,
    is_sticker: Boolean,
    media_id: String,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double
  ): StoryAttachedMedia = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryAttachedMedia]
  }
  
  extension [Self <: StoryAttachedMedia](x: Self) {
    
    inline def setIs_sticker(value: Boolean): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
    
    inline def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
  }
}
