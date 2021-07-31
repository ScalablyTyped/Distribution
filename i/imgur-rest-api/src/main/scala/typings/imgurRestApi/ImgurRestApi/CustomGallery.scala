package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomGallery extends StObject {
  
  var account_url: String
  
  var item_count: Double
  
  var items: js.Array[GalleryItem]
  
  var link: String
  
  var tags: js.Array[String]
}
object CustomGallery {
  
  @scala.inline
  def apply(
    account_url: String,
    item_count: Double,
    items: js.Array[GalleryItem],
    link: String,
    tags: js.Array[String]
  ): CustomGallery = {
    val __obj = js.Dynamic.literal(account_url = account_url.asInstanceOf[js.Any], item_count = item_count.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomGallery]
  }
  
  @scala.inline
  implicit class CustomGalleryMutableBuilder[Self <: CustomGallery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_url(value: String): Self = StObject.set(x, "account_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem_count(value: Double): Self = StObject.set(x, "item_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[GalleryItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: GalleryItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
