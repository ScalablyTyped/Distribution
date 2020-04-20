package typings.ismobilejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDevice extends js.Object {
  var device: Boolean
  var ipod: Boolean
  var phone: Boolean
  var tablet: Boolean
  var universal: Boolean
}

object AnonDevice {
  @scala.inline
  def apply(device: Boolean, ipod: Boolean, phone: Boolean, tablet: Boolean, universal: Boolean): AnonDevice = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], ipod = ipod.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], universal = universal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDevice]
  }
}

