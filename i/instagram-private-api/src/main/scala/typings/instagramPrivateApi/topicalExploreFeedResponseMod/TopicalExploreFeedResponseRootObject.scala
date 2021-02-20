package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseRootObject extends StObject {
  
  var auto_load_more_enabled: Boolean = js.native
  
  var max_id: String = js.native
  
  var more_available: Boolean = js.native
  
  var next_max_id: String = js.native
  
  var rank_token: String = js.native
  
  var sectional_items: js.Array[TopicalExploreFeedResponseSectionalItemsItem] = js.native
  
  var status: String = js.native
}
object TopicalExploreFeedResponseRootObject {
  
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    max_id: String,
    more_available: Boolean,
    next_max_id: String,
    rank_token: String,
    sectional_items: js.Array[TopicalExploreFeedResponseSectionalItemsItem],
    status: String
  ): TopicalExploreFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], sectional_items = sectional_items.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseRootObjectMutableBuilder[Self <: TopicalExploreFeedResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto_load_more_enabled(value: Boolean): Self = StObject.set(x, "auto_load_more_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_id(value: String): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank_token(value: String): Self = StObject.set(x, "rank_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectional_items(value: js.Array[TopicalExploreFeedResponseSectionalItemsItem]): Self = StObject.set(x, "sectional_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectional_itemsVarargs(value: TopicalExploreFeedResponseSectionalItemsItem*): Self = StObject.set(x, "sectional_items", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
