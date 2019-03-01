package typings
package ismobilejsLib.ismobilejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apple extends js.Object {
  var device: scala.Boolean
  var ipod: scala.Boolean
  var phone: scala.Boolean
  var tablet: scala.Boolean
}

object Apple {
  @scala.inline
  def apply(device: scala.Boolean, ipod: scala.Boolean, phone: scala.Boolean, tablet: scala.Boolean): Apple = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("device")(device)
    __obj.updateDynamic("ipod")(ipod)
    __obj.updateDynamic("phone")(phone)
    __obj.updateDynamic("tablet")(tablet)
    __obj.asInstanceOf[Apple]
  }
}

