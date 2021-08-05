package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Album extends StObject {
  
  var account_id: js.UndefOr[Double] = js.undefined
  
  var account_url: js.UndefOr[String] = js.undefined
  
  var cover: String
  
  var cover_height: Double
  
  var cover_width: Double
  
  var datetime: Double
  
  var deletehash: js.UndefOr[String] = js.undefined
  
  var description: String
  
  var favorite: Boolean
  
  var id: String
  
  var images: js.Array[Image]
  
  var images_count: Double
  
  var layout: String
  
  var link: String
  
  var nsfw: js.UndefOr[Boolean] = js.undefined
  
  var order: Double
  
  var privacy: String
  
  var section: String
  
  var title: String
  
  var views: Double
}
object Album {
  
  inline def apply(
    cover: String,
    cover_height: Double,
    cover_width: Double,
    datetime: Double,
    description: String,
    favorite: Boolean,
    id: String,
    images: js.Array[Image],
    images_count: Double,
    layout: String,
    link: String,
    order: Double,
    privacy: String,
    section: String,
    title: String,
    views: Double
  ): Album = {
    val __obj = js.Dynamic.literal(cover = cover.asInstanceOf[js.Any], cover_height = cover_height.asInstanceOf[js.Any], cover_width = cover_width.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], images_count = images_count.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[Album]
  }
  
  extension [Self <: Album](x: Self) {
    
    inline def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setAccount_idUndefined: Self = StObject.set(x, "account_id", js.undefined)
    
    inline def setAccount_url(value: String): Self = StObject.set(x, "account_url", value.asInstanceOf[js.Any])
    
    inline def setAccount_urlUndefined: Self = StObject.set(x, "account_url", js.undefined)
    
    inline def setCover(value: String): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    inline def setCover_height(value: Double): Self = StObject.set(x, "cover_height", value.asInstanceOf[js.Any])
    
    inline def setCover_width(value: Double): Self = StObject.set(x, "cover_width", value.asInstanceOf[js.Any])
    
    inline def setDatetime(value: Double): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setDeletehash(value: String): Self = StObject.set(x, "deletehash", value.asInstanceOf[js.Any])
    
    inline def setDeletehashUndefined: Self = StObject.set(x, "deletehash", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFavorite(value: Boolean): Self = StObject.set(x, "favorite", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    inline def setImages_count(value: Double): Self = StObject.set(x, "images_count", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setNsfw(value: Boolean): Self = StObject.set(x, "nsfw", value.asInstanceOf[js.Any])
    
    inline def setNsfwUndefined: Self = StObject.set(x, "nsfw", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setPrivacy(value: String): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setViews(value: Double): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
