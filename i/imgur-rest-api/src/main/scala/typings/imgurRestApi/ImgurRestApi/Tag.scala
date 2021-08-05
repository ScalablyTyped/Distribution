package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  var followers: Double
  
  var following: js.UndefOr[Boolean] = js.undefined
  
  var items: js.Array[GalleryItem]
  
  var name: String
  
  var total_items: Double
}
object Tag {
  
  inline def apply(followers: Double, items: js.Array[GalleryItem], name: String, total_items: Double): Tag = {
    val __obj = js.Dynamic.literal(followers = followers.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], total_items = total_items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setFollowers(value: Double): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
    
    inline def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    inline def setFollowingUndefined: Self = StObject.set(x, "following", js.undefined)
    
    inline def setItems(value: js.Array[GalleryItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: GalleryItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTotal_items(value: Double): Self = StObject.set(x, "total_items", value.asInstanceOf[js.Any])
  }
}
