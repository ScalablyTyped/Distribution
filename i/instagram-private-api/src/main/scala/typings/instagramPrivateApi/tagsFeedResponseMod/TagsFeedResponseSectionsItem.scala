package typings.instagramPrivateApi.tagsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsFeedResponseSectionsItem extends StObject {
  
  var explore_item_info: TagsFeedResponseExploreItemInfo
  
  var feed_type: String
  
  var layout_content: TagsFeedResponseLayoutContent
  
  var layout_type: String
}
object TagsFeedResponseSectionsItem {
  
  @scala.inline
  def apply(
    explore_item_info: TagsFeedResponseExploreItemInfo,
    feed_type: String,
    layout_content: TagsFeedResponseLayoutContent,
    layout_type: String
  ): TagsFeedResponseSectionsItem = {
    val __obj = js.Dynamic.literal(explore_item_info = explore_item_info.asInstanceOf[js.Any], feed_type = feed_type.asInstanceOf[js.Any], layout_content = layout_content.asInstanceOf[js.Any], layout_type = layout_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseSectionsItem]
  }
  
  @scala.inline
  implicit class TagsFeedResponseSectionsItemMutableBuilder[Self <: TagsFeedResponseSectionsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplore_item_info(value: TagsFeedResponseExploreItemInfo): Self = StObject.set(x, "explore_item_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeed_type(value: String): Self = StObject.set(x, "feed_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout_content(value: TagsFeedResponseLayoutContent): Self = StObject.set(x, "layout_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout_type(value: String): Self = StObject.set(x, "layout_type", value.asInstanceOf[js.Any])
  }
}
