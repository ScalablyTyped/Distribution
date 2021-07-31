package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseThumbnails extends StObject {
  
  var max_thumbnails_per_sprite: Double
  
  var rendered_width: Double
  
  var sprite_height: Double
  
  var sprite_urls: js.Array[String]
  
  var sprite_width: Double
  
  var thumbnail_duration: String
  
  var thumbnail_height: Double
  
  var thumbnail_width: Double
  
  var thumbnails_per_row: Double
  
  var video_length: Double
}
object TopicalExploreFeedResponseThumbnails {
  
  @scala.inline
  def apply(
    max_thumbnails_per_sprite: Double,
    rendered_width: Double,
    sprite_height: Double,
    sprite_urls: js.Array[String],
    sprite_width: Double,
    thumbnail_duration: String,
    thumbnail_height: Double,
    thumbnail_width: Double,
    thumbnails_per_row: Double,
    video_length: Double
  ): TopicalExploreFeedResponseThumbnails = {
    val __obj = js.Dynamic.literal(max_thumbnails_per_sprite = max_thumbnails_per_sprite.asInstanceOf[js.Any], rendered_width = rendered_width.asInstanceOf[js.Any], sprite_height = sprite_height.asInstanceOf[js.Any], sprite_urls = sprite_urls.asInstanceOf[js.Any], sprite_width = sprite_width.asInstanceOf[js.Any], thumbnail_duration = thumbnail_duration.asInstanceOf[js.Any], thumbnail_height = thumbnail_height.asInstanceOf[js.Any], thumbnail_width = thumbnail_width.asInstanceOf[js.Any], thumbnails_per_row = thumbnails_per_row.asInstanceOf[js.Any], video_length = video_length.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseThumbnails]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseThumbnailsMutableBuilder[Self <: TopicalExploreFeedResponseThumbnails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax_thumbnails_per_sprite(value: Double): Self = StObject.set(x, "max_thumbnails_per_sprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendered_width(value: Double): Self = StObject.set(x, "rendered_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSprite_height(value: Double): Self = StObject.set(x, "sprite_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSprite_urls(value: js.Array[String]): Self = StObject.set(x, "sprite_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSprite_urlsVarargs(value: String*): Self = StObject.set(x, "sprite_urls", js.Array(value :_*))
    
    @scala.inline
    def setSprite_width(value: Double): Self = StObject.set(x, "sprite_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail_duration(value: String): Self = StObject.set(x, "thumbnail_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail_height(value: Double): Self = StObject.set(x, "thumbnail_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail_width(value: Double): Self = StObject.set(x, "thumbnail_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnails_per_row(value: Double): Self = StObject.set(x, "thumbnails_per_row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_length(value: Double): Self = StObject.set(x, "video_length", value.asInstanceOf[js.Any])
  }
}
