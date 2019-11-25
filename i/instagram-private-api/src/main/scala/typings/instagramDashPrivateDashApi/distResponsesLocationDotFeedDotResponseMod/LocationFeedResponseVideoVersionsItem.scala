package typings.instagramDashPrivateDashApi.distResponsesLocationDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationFeedResponseVideoVersionsItem extends js.Object {
  var height: Double
  var id: String
  var `type`: Double
  var url: String
  var width: Double
}

object LocationFeedResponseVideoVersionsItem {
  @scala.inline
  def apply(height: Double, id: String, `type`: Double, url: String, width: Double): LocationFeedResponseVideoVersionsItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseVideoVersionsItem]
  }
}

