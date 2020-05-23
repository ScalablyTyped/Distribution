package typings.j5IoTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPinInfo extends js.Object {
  var peripherals: js.Array[PeripheralType]
  var pins: js.Array[String]
}

object IPinInfo {
  @scala.inline
  def apply(peripherals: js.Array[PeripheralType], pins: js.Array[String]): IPinInfo = {
    val __obj = js.Dynamic.literal(peripherals = peripherals.asInstanceOf[js.Any], pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPinInfo]
  }
}

