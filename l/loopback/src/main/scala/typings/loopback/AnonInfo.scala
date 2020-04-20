package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInfo extends js.Object {
  var info: js.Any
  var infoCount: Double
}

object AnonInfo {
  @scala.inline
  def apply(info: js.Any, infoCount: Double): AnonInfo = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], infoCount = infoCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInfo]
  }
}

