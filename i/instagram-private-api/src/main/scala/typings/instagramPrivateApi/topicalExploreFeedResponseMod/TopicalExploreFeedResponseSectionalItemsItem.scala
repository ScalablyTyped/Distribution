package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseSectionalItemsItem extends js.Object {
  
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
  implicit class TopicalExploreFeedResponseSectionalItemsItemOps[Self <: TopicalExploreFeedResponseSectionalItemsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExplore_item_info(value: TopicalExploreFeedResponseExploreItemInfo): Self = this.set("explore_item_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeed_type(value: String): Self = this.set("feed_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout_content(value: TopicalExploreFeedResponseLayoutContent): Self = this.set("layout_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout_type(value: String): Self = this.set("layout_type", value.asInstanceOf[js.Any])
  }
}
