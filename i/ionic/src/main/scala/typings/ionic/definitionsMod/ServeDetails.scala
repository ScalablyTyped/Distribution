package typings.ionic.definitionsMod

import typings.atIonicUtilsDashNetwork.atIonicUtilsDashNetworkMod.NetworkInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeDetails extends js.Object {
  var custom: Boolean
  var externalAddress: String
  var externalNetworkInterfaces: js.Array[NetworkInterface]
  var externallyAccessible: Boolean
  var localAddress: String
  var port: Double
  var protocol: String
}

object ServeDetails {
  @scala.inline
  def apply(
    custom: Boolean,
    externalAddress: String,
    externalNetworkInterfaces: js.Array[NetworkInterface],
    externallyAccessible: Boolean,
    localAddress: String,
    port: Double,
    protocol: String
  ): ServeDetails = {
    val __obj = js.Dynamic.literal(custom = custom, externalAddress = externalAddress, externalNetworkInterfaces = externalNetworkInterfaces, externallyAccessible = externallyAccessible, localAddress = localAddress, port = port, protocol = protocol)
  
    __obj.asInstanceOf[ServeDetails]
  }
}

