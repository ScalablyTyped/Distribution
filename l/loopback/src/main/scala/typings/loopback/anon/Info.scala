package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  var info: js.Any
  var infoCount: Double
}

object Info {
  @scala.inline
  def apply(info: js.Any, infoCount: Double): Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], infoCount = infoCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
}

