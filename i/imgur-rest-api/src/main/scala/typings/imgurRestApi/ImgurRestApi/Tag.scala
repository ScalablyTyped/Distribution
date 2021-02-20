package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tag extends StObject {
  
  var followers: Double = js.native
  
  var following: js.UndefOr[Boolean] = js.native
  
  var items: js.Array[GalleryItem] = js.native
  
  var name: String = js.native
  
  var total_items: Double = js.native
}
object Tag {
  
  @scala.inline
  def apply(followers: Double, items: js.Array[GalleryItem], name: String, total_items: Double): Tag = {
    val __obj = js.Dynamic.literal(followers = followers.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], total_items = total_items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowers(value: Double): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowingUndefined: Self = StObject.set(x, "following", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[GalleryItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: GalleryItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_items(value: Double): Self = StObject.set(x, "total_items", value.asInstanceOf[js.Any])
  }
}
