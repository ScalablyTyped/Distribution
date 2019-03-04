package typings
package ibmDashMobilefirstLib.WLNs.DeviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressPair extends js.Object {
  var `3GAddress`: java.lang.String
  var wifiAddress: java.lang.String
}

object AddressPair {
  @scala.inline
  def apply(`3GAddress`: java.lang.String, wifiAddress: java.lang.String): AddressPair = {
    val __obj = js.Dynamic.literal(wifiAddress = wifiAddress)
    __obj.updateDynamic("3GAddress")(`3GAddress`)
    __obj.asInstanceOf[AddressPair]
  }
}

