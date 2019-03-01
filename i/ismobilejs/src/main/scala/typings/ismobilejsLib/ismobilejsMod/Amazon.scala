package typings
package ismobilejsLib.ismobilejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amazon extends js.Object {
  var device: scala.Boolean
  var phone: scala.Boolean
  var tablet: scala.Boolean
}

object Amazon {
  @scala.inline
  def apply(device: scala.Boolean, phone: scala.Boolean, tablet: scala.Boolean): Amazon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("device")(device)
    __obj.updateDynamic("phone")(phone)
    __obj.updateDynamic("tablet")(tablet)
    __obj.asInstanceOf[Amazon]
  }
}

