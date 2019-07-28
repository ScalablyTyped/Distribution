package typings.ibmDashMobilefirst.WLNs.DeviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressPair extends js.Object {
  var `3GAddress`: String
  var wifiAddress: String
}

object AddressPair {
  @scala.inline
  def apply(`3GAddress`: String, wifiAddress: String): AddressPair = {
    val __obj = js.Dynamic.literal(wifiAddress = wifiAddress)
    __obj.updateDynamic("3GAddress")(`3GAddress`)
    __obj.asInstanceOf[AddressPair]
  }
}

