package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseSectionalItemsItem extends StObject {
  
  var explore_item_info: TopicalExploreFeedResponseExploreItemInfo = js.native
  
  var feed_type: String = js.native
  
  var layout_content: TopicalExploreFeedResponseLayoutContent = js.native
  
  var layout_type: String = js.native
}
object TopicalExploreFeedResponseSectionalItemsItem {
  
  @scala.inline
  def apply(
    explore_item_info: TopicalExploreFeedResponseExploreItemInfo,
    feed_type: String,
    layout_content: TopicalExploreFeedResponseLayoutContent,
    layout_type: String
  ): TopicalExploreFeedResponseSectionalItemsItem = {
    val __obj = js.Dynamic.literal(explore_item_info = explore_item_info.asInstanceOf[js.Any], feed_type = feed_type.asInstanceOf[js.Any], layout_content = layout_content.asInstanceOf[js.Any], layout_type = layout_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseSectionalItemsItem]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseSectionalItemsItemMutableBuilder[Self <: TopicalExploreFeedResponseSectionalItemsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplore_item_info(value: TopicalExploreFeedResponseExploreItemInfo): Self = StObject.set(x, "explore_item_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeed_type(value: String): Self = StObject.set(x, "feed_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout_content(value: TopicalExploreFeedResponseLayoutContent): Self = StObject.set(x, "layout_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout_type(value: String): Self = StObject.set(x, "layout_type", value.asInstanceOf[js.Any])
  }
}
