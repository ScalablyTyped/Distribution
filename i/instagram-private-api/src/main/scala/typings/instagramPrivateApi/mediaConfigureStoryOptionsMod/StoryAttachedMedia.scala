package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryAttachedMedia extends StorySticker {
  
  var is_sticker: Boolean = js.native
  
  var media_id: String = js.native
}
object StoryAttachedMedia {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class StoryAttachedMediaMutableBuilder[Self <: StoryAttachedMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIs_sticker(value: Boolean): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
  }
}
