package typings.ismobilejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlackberry extends js.Object {
  var blackberry: Boolean
  var blackberry10: Boolean
  var chrome: Boolean
  var device: Boolean
  var firefox: Boolean
  var opera: Boolean
}

object AnonBlackberry {
  @scala.inline
  def apply(
    blackberry: Boolean,
    blackberry10: Boolean,
    chrome: Boolean,
    device: Boolean,
    firefox: Boolean,
    opera: Boolean
  ): AnonBlackberry = {
    val __obj = js.Dynamic.literal(blackberry = blackberry.asInstanceOf[js.Any], blackberry10 = blackberry10.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlackberry]
  }
}

