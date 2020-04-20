package typings.instagramPrivateApi.tagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsFeedResponse extends js.Object {
  var more_available: Boolean
  var next_max_id: String
  var next_media_ids: js.Array[String]
  var next_page: Double
  var sections: js.Array[TagsFeedResponseSectionsItem]
  var status: String
}

object TagsFeedResponse {
  @scala.inline
  def apply(
    more_available: Boolean,
    next_max_id: String,
    next_media_ids: js.Array[String],
    next_page: Double,
    sections: js.Array[TagsFeedResponseSectionsItem],
    status: String
  ): TagsFeedResponse = {
    val __obj = js.Dynamic.literal(more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], next_media_ids = next_media_ids.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponse]
  }
}

