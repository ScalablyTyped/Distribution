package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevAppDetails extends js.Object {
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var commPort: scala.Double
  var interfaces: js.Array[ionicLib.Anon_Address]
  var port: scala.Double
}

object DevAppDetails {
  @scala.inline
  def apply(
    commPort: scala.Double,
    interfaces: js.Array[ionicLib.Anon_Address],
    port: scala.Double,
    channel: java.lang.String = null
  ): DevAppDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commPort")(commPort)
    __obj.updateDynamic("interfaces")(interfaces)
    __obj.updateDynamic("port")(port)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    __obj.asInstanceOf[DevAppDetails]
  }
}

