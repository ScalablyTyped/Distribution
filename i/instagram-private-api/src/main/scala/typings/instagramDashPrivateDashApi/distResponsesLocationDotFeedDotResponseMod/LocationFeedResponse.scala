package typings.instagramDashPrivateDashApi.distResponsesLocationDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationFeedResponse extends js.Object {
  var more_available: Boolean
  var next_max_id: String
  var next_media_ids: js.Array[String]
  var next_page: Double
  var sections: js.Array[LocationFeedResponseSectionsItem]
  var status: String
}

object LocationFeedResponse {
  @scala.inline
  def apply(
    more_available: Boolean,
    next_max_id: String,
    next_media_ids: js.Array[String],
    next_page: Double,
    sections: js.Array[LocationFeedResponseSectionsItem],
    status: String
  ): LocationFeedResponse = {
    val __obj = js.Dynamic.literal(more_available = more_available, next_max_id = next_max_id, next_media_ids = next_media_ids, next_page = next_page, sections = sections, status = status)
  
    __obj.asInstanceOf[LocationFeedResponse]
  }
}

