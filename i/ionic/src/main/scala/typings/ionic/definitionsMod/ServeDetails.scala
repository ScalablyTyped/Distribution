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
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], externalAddress = externalAddress.asInstanceOf[js.Any], externalNetworkInterfaces = externalNetworkInterfaces.asInstanceOf[js.Any], externallyAccessible = externallyAccessible.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServeDetails]
  }
}

