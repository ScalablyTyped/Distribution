package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GalleryImage
  extends StObject
     with GalleryItem {
  
  var animated: Boolean
  
  var bandwidth: Double
  
  var deletehash: js.UndefOr[String] = js.undefined
  
  var gifv: js.UndefOr[String] = js.undefined
  
  var height: Double
  
  var looping: js.UndefOr[Boolean] = js.undefined
  
  var mp4: js.UndefOr[String] = js.undefined
  
  var section: String
  
  var size: Double
  
  var `type`: String
  
  var webm: js.UndefOr[String] = js.undefined
  
  var width: Double
}
object GalleryImage {
  
  inline def apply(
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
  
  extension [Self <: GalleryImage](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setDeletehash(value: String): Self = StObject.set(x, "deletehash", value.asInstanceOf[js.Any])
    
    inline def setDeletehashUndefined: Self = StObject.set(x, "deletehash", js.undefined)
    
    inline def setGifv(value: String): Self = StObject.set(x, "gifv", value.asInstanceOf[js.Any])
    
    inline def setGifvUndefined: Self = StObject.set(x, "gifv", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLooping(value: Boolean): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
    
    inline def setLoopingUndefined: Self = StObject.set(x, "looping", js.undefined)
    
    inline def setMp4(value: String): Self = StObject.set(x, "mp4", value.asInstanceOf[js.Any])
    
    inline def setMp4Undefined: Self = StObject.set(x, "mp4", js.undefined)
    
    inline def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWebm(value: String): Self = StObject.set(x, "webm", value.asInstanceOf[js.Any])
    
    inline def setWebmUndefined: Self = StObject.set(x, "webm", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
