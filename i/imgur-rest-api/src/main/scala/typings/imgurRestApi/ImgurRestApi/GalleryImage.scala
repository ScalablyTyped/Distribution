package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GalleryImage extends GalleryItem {
  
  var animated: Boolean = js.native
  
  var bandwidth: Double = js.native
  
  var deletehash: js.UndefOr[String] = js.native
  
  var gifv: js.UndefOr[String] = js.native
  
  var height: Double = js.native
  
  var looping: js.UndefOr[Boolean] = js.native
  
  var mp4: js.UndefOr[String] = js.native
  
  var section: String = js.native
  
  var size: Double = js.native
  
  var `type`: String = js.native
  
  var webm: js.UndefOr[String] = js.native
  
  var width: Double = js.native
}
object GalleryImage {
  
  @scala.inline
  def apply(
    animated: Boolean,
    bandwidth: Double,
    comment_count: Double,
    datetime: Double,
    description: String,
    downs: Double,
    favorite: Boolean,
    height: Double,
    id: String,
    is_album: Boolean,
    link: String,
    score: Double,
    section: String,
    size: Double,
    title: String,
    topic: String,
    topic_id: Double,
    `type`: String,
    ups: Double,
    views: Double,
    width: Double
  ): GalleryImage = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], bandwidth = bandwidth.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_album = is_album.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], topic_id = topic_id.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryImage]
  }
  
  @scala.inline
  implicit class GalleryImageOps[Self <: GalleryImage] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidth(value: Double): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: String): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletehash(value: String): Self = this.set("deletehash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletehash: Self = this.set("deletehash", js.undefined)
    
    @scala.inline
    def setGifv(value: String): Self = this.set("gifv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGifv: Self = this.set("gifv", js.undefined)
    
    @scala.inline
    def setLooping(value: Boolean): Self = this.set("looping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLooping: Self = this.set("looping", js.undefined)
    
    @scala.inline
    def setMp4(value: String): Self = this.set("mp4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMp4: Self = this.set("mp4", js.undefined)
    
    @scala.inline
    def setWebm(value: String): Self = this.set("webm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebm: Self = this.set("webm", js.undefined)
  }
}
