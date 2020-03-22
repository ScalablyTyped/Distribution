package typings.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/session/session.ISessionConnection.IOptions, 'model' | 'connectToKernel' | 'serverSettings'> */
trait OmitIOptionsmodelconnectT extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var kernelConnectionOptions: js.UndefOr[OmitIOptionsmodelusername] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object OmitIOptionsmodelconnectT {
  @scala.inline
  def apply(
    clientId: String = null,
    kernelConnectionOptions: OmitIOptionsmodelusername = null,
    username: String = null
  ): OmitIOptionsmodelconnectT = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (kernelConnectionOptions != null) __obj.updateDynamic("kernelConnectionOptions")(kernelConnectionOptions.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitIOptionsmodelconnectT]
  }
}

