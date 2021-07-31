package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgtvBrowseFeedResponseBrowseItemsItem extends StObject {
  
  var item: IgtvBrowseFeedResponseItem
  
  var `type`: String
}
object IgtvBrowseFeedResponseBrowseItemsItem {
  
  @scala.inline
  def apply(item: IgtvBrowseFeedResponseItem, `type`: String): IgtvBrowseFeedResponseBrowseItemsItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseBrowseItemsItem]
  }
  
  @scala.inline
  implicit class IgtvBrowseFeedResponseBrowseItemsItemMutableBuilder[Self <: IgtvBrowseFeedResponseBrowseItemsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: IgtvBrowseFeedResponseItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
