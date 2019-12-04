package typings.instagramDashPrivateDashApi.distResponsesTagDotRepositoryDotSectionDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagRepositorySectionResponseRootObject extends js.Object {
  var auto_load_more_enabled: Boolean
  var more_available: Boolean
  var next_max_id: String
  var next_media_ids: js.Array[String]
  var next_page: Double
  var sections: js.Array[TagRepositorySectionResponsesectionsItem]
  var status: String
}

object TagRepositorySectionResponseRootObject {
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    more_available: Boolean,
    next_max_id: String,
    next_media_ids: js.Array[String],
    next_page: Double,
    sections: js.Array[TagRepositorySectionResponsesectionsItem],
    status: String
  ): TagRepositorySectionResponseRootObject = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], next_media_ids = next_media_ids.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagRepositorySectionResponseRootObject]
  }
}

