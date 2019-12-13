package typings.instagramDashPrivateDashApi.distResponsesIgtvDotBrowseDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvBrowseFeedResponseBrowseItemsItem extends js.Object {
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
}

