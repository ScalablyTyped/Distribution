package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvBrowseFeedResponseThumbnails extends js.Object {
  
  var max_thumbnails_per_sprite: Double = js.native
  
  var rendered_width: Double = js.native
  
  var sprite_height: Double = js.native
  
  var sprite_urls: js.Array[String] = js.native
  
  var sprite_width: Double = js.native
  
  var thumbnail_duration: String = js.native
  
  var thumbnail_height: Double = js.native
  
  var thumbnail_width: Double = js.native
  
  var thumbnails_per_row: Double = js.native
  
  var video_length: Double = js.native
}
object IgtvBrowseFeedResponseThumbnails {
  
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
  ): IgtvBrowseFeedResponseThumbnails = {
    val __obj = js.Dynamic.literal(max_thumbnails_per_sprite = max_thumbnails_per_sprite.asInstanceOf[js.Any], rendered_width = rendered_width.asInstanceOf[js.Any], sprite_height = sprite_height.asInstanceOf[js.Any], sprite_urls = sprite_urls.asInstanceOf[js.Any], sprite_width = sprite_width.asInstanceOf[js.Any], thumbnail_duration = thumbnail_duration.asInstanceOf[js.Any], thumbnail_height = thumbnail_height.asInstanceOf[js.Any], thumbnail_width = thumbnail_width.asInstanceOf[js.Any], thumbnails_per_row = thumbnails_per_row.asInstanceOf[js.Any], video_length = video_length.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseThumbnails]
  }
  
  @scala.inline
  implicit class IgtvBrowseFeedResponseThumbnailsOps[Self <: IgtvBrowseFeedResponseThumbnails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMax_thumbnails_per_sprite(value: Double): Self = this.set("max_thumbnails_per_sprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendered_width(value: Double): Self = this.set("rendered_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSprite_height(value: Double): Self = this.set("sprite_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSprite_urlsVarargs(value: String*): Self = this.set("sprite_urls", js.Array(value :_*))
    
    @scala.inline
    def setSprite_urls(value: js.Array[String]): Self = this.set("sprite_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSprite_width(value: Double): Self = this.set("sprite_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail_duration(value: String): Self = this.set("thumbnail_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail_height(value: Double): Self = this.set("thumbnail_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail_width(value: Double): Self = this.set("thumbnail_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnails_per_row(value: Double): Self = this.set("thumbnails_per_row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_length(value: Double): Self = this.set("video_length", value.asInstanceOf[js.Any])
  }
}
