package typings.instagramDashPrivateDashApi.distResponsesTagDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFeedResponseCreative_config extends js.Object {
  var camera_facing: String
  var capture_type: String
  var should_render_try_it_on: Boolean
}

object TagFeedResponseCreative_config {
  @scala.inline
  def apply(camera_facing: String, capture_type: String, should_render_try_it_on: Boolean): TagFeedResponseCreative_config = {
    val __obj = js.Dynamic.literal(camera_facing = camera_facing.asInstanceOf[js.Any], capture_type = capture_type.asInstanceOf[js.Any], should_render_try_it_on = should_render_try_it_on.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagFeedResponseCreative_config]
  }
}

