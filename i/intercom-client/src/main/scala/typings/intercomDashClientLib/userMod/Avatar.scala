package typings
package intercomDashClientLib.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Avatar extends js.Object {
  var image_url: java.lang.String | scala.Null
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.avatar
}

object Avatar {
  @scala.inline
  def apply(
    `type`: intercomDashClientLib.intercomDashClientLibStrings.avatar,
    image_url: java.lang.String = null
  ): Avatar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (image_url != null) __obj.updateDynamic("image_url")(image_url)
    __obj.asInstanceOf[Avatar]
  }
}

