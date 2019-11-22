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
    val __obj = js.Dynamic.literal(height = height, id = id, url = url, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LocationFeedResponseVideoVersionsItem]
  }
}

