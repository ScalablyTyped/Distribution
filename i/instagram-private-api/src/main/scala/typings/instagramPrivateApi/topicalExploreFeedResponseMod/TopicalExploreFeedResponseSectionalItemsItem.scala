package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseSectionalItemsItem extends StObject {
  
  var explore_item_info: TopicalExploreFeedResponseExploreItemInfo
  
  var feed_type: String
  
  var layout_content: TopicalExploreFeedResponseLayoutContent
  
  var layout_type: String
}
object TopicalExploreFeedResponseSectionalItemsItem {
  
  inline def apply(
    explore_item_info: TopicalExploreFeedResponseExploreItemInfo,
    feed_type: String,
    layout_content: TopicalExploreFeedResponseLayoutContent,
    layout_type: String
  ): TopicalExploreFeedResponseSectionalItemsItem = {
    val __obj = js.Dynamic.literal(explore_item_info = explore_item_info.asInstanceOf[js.Any], feed_type = feed_type.asInstanceOf[js.Any], layout_content = layout_content.asInstanceOf[js.Any], layout_type = layout_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseSectionalItemsItem]
  }
  
  extension [Self <: TopicalExploreFeedResponseSectionalItemsItem](x: Self) {
    
    inline def setExplore_item_info(value: TopicalExploreFeedResponseExploreItemInfo): Self = StObject.set(x, "explore_item_info", value.asInstanceOf[js.Any])
    
    inline def setFeed_type(value: String): Self = StObject.set(x, "feed_type", value.asInstanceOf[js.Any])
    
    inline def setLayout_content(value: TopicalExploreFeedResponseLayoutContent): Self = StObject.set(x, "layout_content", value.asInstanceOf[js.Any])
    
    inline def setLayout_type(value: String): Self = StObject.set(x, "layout_type", value.asInstanceOf[js.Any])
  }
}
