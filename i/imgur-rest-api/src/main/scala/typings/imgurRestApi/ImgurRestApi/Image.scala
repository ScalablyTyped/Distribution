package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var account_id: js.UndefOr[Double] = js.undefined
  
  var account_url: js.UndefOr[String] = js.undefined
  
  var animated: Boolean
  
  var bandwidth: Double
  
  var datetime: Double
  
  var deletehash: js.UndefOr[String] = js.undefined
  
  var description: String
  
  var favorite: Boolean
  
  var gifv: js.UndefOr[String] = js.undefined
  
  var height: Double
  
  var id: String
  
  var link: String
  
  var looping: js.UndefOr[Boolean] = js.undefined
  
  var mp4: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var nsfw: js.UndefOr[Boolean] = js.undefined
  
  var section: String
  
  var size: Double
  
  var title: String
  
  var `type`: String
  
  var views: Double
  
  var vote: js.UndefOr[String] = js.undefined
  
  var webm: js.UndefOr[String] = js.undefined
  
  var width: Double
}
object Image {
  
  @scala.inline
  def apply(
    animated: Boolean,
    bandwidth: Double,
    datetime: Double,
    description: String,
    favorite: Boolean,
    height: Double,
    id: String,
    link: String,
    section: String,
    size: Double,
    title: String,
    `type`: String,
    views: Double,
    width: Double
  ): Image = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], bandwidth = bandwidth.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_idUndefined: Self = StObject.set(x, "account_id", js.undefined)
    
    @scala.inline
    def setAccount_url(value: String): Self = StObject.set(x, "account_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_urlUndefined: Self = StObject.set(x, "account_url", js.undefined)
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetime(value: Double): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletehash(value: String): Self = StObject.set(x, "deletehash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletehashUndefined: Self = StObject.set(x, "deletehash", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavorite(value: Boolean): Self = StObject.set(x, "favorite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGifv(value: String): Self = StObject.set(x, "gifv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGifvUndefined: Self = StObject.set(x, "gifv", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLooping(value: Boolean): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopingUndefined: Self = StObject.set(x, "looping", js.undefined)
    
    @scala.inline
    def setMp4(value: String): Self = StObject.set(x, "mp4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMp4Undefined: Self = StObject.set(x, "mp4", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNsfw(value: Boolean): Self = StObject.set(x, "nsfw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNsfwUndefined: Self = StObject.set(x, "nsfw", js.undefined)
    
    @scala.inline
    def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViews(value: Double): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVote(value: String): Self = StObject.set(x, "vote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoteUndefined: Self = StObject.set(x, "vote", js.undefined)
    
    @scala.inline
    def setWebm(value: String): Self = StObject.set(x, "webm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebmUndefined: Self = StObject.set(x, "webm", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
