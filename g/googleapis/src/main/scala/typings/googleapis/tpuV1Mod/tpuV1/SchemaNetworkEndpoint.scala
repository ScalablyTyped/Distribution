package typings.googleapis.tpuV1Mod.tpuV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A network endpoint over which a TPU worker can be reached.
  */
@js.native
trait SchemaNetworkEndpoint extends js.Object {
  /**
    * The IP address of this network endpoint.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * The port of this network endpoint.
    */
  var port: js.UndefOr[Double] = js.native
}

object SchemaNetworkEndpoint {
  @scala.inline
  def apply(ipAddress: String = null, port: js.UndefOr[Double] = js.undefined): SchemaNetworkEndpoint = {
    val __obj = js.Dynamic.literal()
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkEndpoint]
  }
}

