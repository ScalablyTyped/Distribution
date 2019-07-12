package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraLibConfig extends js.Object {
  var faucetServerHost: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var network: js.UndefOr[LibraNetwork] = js.undefined
  var port: js.UndefOr[java.lang.String] = js.undefined
  var validatorSetFile: js.UndefOr[java.lang.String] = js.undefined
}

object LibraLibConfig {
  @scala.inline
  def apply(
    faucetServerHost: java.lang.String = null,
    host: java.lang.String = null,
    network: LibraNetwork = null,
    port: java.lang.String = null,
    validatorSetFile: java.lang.String = null
  ): LibraLibConfig = {
    val __obj = js.Dynamic.literal()
    if (faucetServerHost != null) __obj.updateDynamic("faucetServerHost")(faucetServerHost)
    if (host != null) __obj.updateDynamic("host")(host)
    if (network != null) __obj.updateDynamic("network")(network)
    if (port != null) __obj.updateDynamic("port")(port)
    if (validatorSetFile != null) __obj.updateDynamic("validatorSetFile")(validatorSetFile)
    __obj.asInstanceOf[LibraLibConfig]
  }
}

