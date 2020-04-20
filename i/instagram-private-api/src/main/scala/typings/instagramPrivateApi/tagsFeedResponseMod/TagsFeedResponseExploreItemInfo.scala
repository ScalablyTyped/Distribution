package typings.instagramPrivateApi.tagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsFeedResponseExploreItemInfo extends js.Object {
  var aspect_ratio: Double
  var autoplay: Boolean
  var num_columns: Double
  var total_num_columns: Double
}

object TagsFeedResponseExploreItemInfo {
  @scala.inline
  def apply(aspect_ratio: Double, autoplay: Boolean, num_columns: Double, total_num_columns: Double): TagsFeedResponseExploreItemInfo = {
    val __obj = js.Dynamic.literal(aspect_ratio = aspect_ratio.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], num_columns = num_columns.asInstanceOf[js.Any], total_num_columns = total_num_columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseExploreItemInfo]
  }
}

