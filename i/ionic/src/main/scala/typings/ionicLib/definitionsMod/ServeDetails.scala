package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeDetails extends js.Object {
  var custom: scala.Boolean
  var externalAddress: java.lang.String
  var externalNetworkInterfaces: js.Array[atIonicUtilsDashNetworkLib.atIonicUtilsDashNetworkMod.NetworkInterface]
  var externallyAccessible: scala.Boolean
  var localAddress: java.lang.String
  var port: scala.Double
  var protocol: java.lang.String
}

object ServeDetails {
  @scala.inline
  def apply(
    custom: scala.Boolean,
    externalAddress: java.lang.String,
    externalNetworkInterfaces: js.Array[atIonicUtilsDashNetworkLib.atIonicUtilsDashNetworkMod.NetworkInterface],
    externallyAccessible: scala.Boolean,
    localAddress: java.lang.String,
    port: scala.Double,
    protocol: java.lang.String
  ): ServeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("custom")(custom)
    __obj.updateDynamic("externalAddress")(externalAddress)
    __obj.updateDynamic("externalNetworkInterfaces")(externalNetworkInterfaces)
    __obj.updateDynamic("externallyAccessible")(externallyAccessible)
    __obj.updateDynamic("localAddress")(localAddress)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[ServeDetails]
  }
}

