package typings.instagramPrivateApi.savedFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedFeedResponseRootObject extends StObject {
  
  var auto_load_more_enabled: Boolean = js.native
  
  var items: js.Array[SavedFeedResponseItemsItem] = js.native
  
  var more_available: Boolean = js.native
  
  var next_max_id: String = js.native
  
  var num_results: Double = js.native
  
  var status: String = js.native
}
object SavedFeedResponseRootObject {
  
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    items: js.Array[SavedFeedResponseItemsItem],
    more_available: Boolean,
    next_max_id: String,
    num_results: Double,
    status: String
  ): SavedFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class SavedFeedResponseRootObjectMutableBuilder[Self <: SavedFeedResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto_load_more_enabled(value: Boolean): Self = StObject.set(x, "auto_load_more_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[SavedFeedResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: SavedFeedResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_results(value: Double): Self = StObject.set(x, "num_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
