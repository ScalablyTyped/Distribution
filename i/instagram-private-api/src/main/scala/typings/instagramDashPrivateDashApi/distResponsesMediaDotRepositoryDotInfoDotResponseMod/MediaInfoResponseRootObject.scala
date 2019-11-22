package typings.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotInfoDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaInfoResponseRootObject extends js.Object {
  var auto_load_more_enabled: Boolean
  var items: js.Array[MediaInfoResponseItemsItem]
  var more_available: Boolean
  var num_results: Double
  var status: String
}

object MediaInfoResponseRootObject {
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    items: js.Array[MediaInfoResponseItemsItem],
    more_available: Boolean,
    num_results: Double,
    status: String
  ): MediaInfoResponseRootObject = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled, items = items, more_available = more_available, num_results = num_results, status = status)
  
    __obj.asInstanceOf[MediaInfoResponseRootObject]
  }
}

