package typings.ionicUtilsNetwork.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var device: String
}

object Device {
  @scala.inline
  def apply(device: String): Device = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

