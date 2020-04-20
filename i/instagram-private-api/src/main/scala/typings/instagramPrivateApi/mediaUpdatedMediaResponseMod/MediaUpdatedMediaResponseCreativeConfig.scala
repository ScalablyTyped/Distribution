package typings.instagramPrivateApi.mediaUpdatedMediaResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaUpdatedMediaResponseCreativeConfig extends js.Object {
  var camera_facing: String
  var capture_type: String
  var should_render_try_it_on: Boolean
}

object MediaUpdatedMediaResponseCreativeConfig {
  @scala.inline
  def apply(camera_facing: String, capture_type: String, should_render_try_it_on: Boolean): MediaUpdatedMediaResponseCreativeConfig = {
    val __obj = js.Dynamic.literal(camera_facing = camera_facing.asInstanceOf[js.Any], capture_type = capture_type.asInstanceOf[js.Any], should_render_try_it_on = should_render_try_it_on.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaUpdatedMediaResponseCreativeConfig]
  }
}

