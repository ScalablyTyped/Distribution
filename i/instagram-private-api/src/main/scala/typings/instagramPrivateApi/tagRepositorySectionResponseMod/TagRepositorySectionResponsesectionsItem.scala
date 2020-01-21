package typings.instagramPrivateApi.tagRepositorySectionResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagRepositorySectionResponsesectionsItem extends js.Object {
  var explore_item_info: js.Array[String]
  var feed_type: String
  var layout_content: js.Array[String]
  var layout_type: String
}

object TagRepositorySectionResponsesectionsItem {
  @scala.inline
  def apply(
    explore_item_info: js.Array[String],
    feed_type: String,
    layout_content: js.Array[String],
    layout_type: String
  ): TagRepositorySectionResponsesectionsItem = {
    val __obj = js.Dynamic.literal(explore_item_info = explore_item_info.asInstanceOf[js.Any], feed_type = feed_type.asInstanceOf[js.Any], layout_content = layout_content.asInstanceOf[js.Any], layout_type = layout_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagRepositorySectionResponsesectionsItem]
  }
}

