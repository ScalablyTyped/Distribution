package typings.intercomDashClient.userMod

import typings.intercomDashClient.intercomDashClientStrings.avatar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Avatar extends js.Object {
  var image_url: String | Null
  var `type`: avatar
}

object Avatar {
  @scala.inline
  def apply(`type`: avatar, image_url: String = null): Avatar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (image_url != null) __obj.updateDynamic("image_url")(image_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
}

