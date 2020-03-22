package typings.jupyterlabServices

import typings.jupyterlabServices.sessionSessionMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/session/session.ISessionConnection.IOptions, 'connectToKernel' | 'serverSettings'> */
trait OmitIOptionsconnectToKern extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var kernelConnectionOptions: js.UndefOr[OmitIOptionsmodelusername] = js.undefined
  var model: IModel
  var username: js.UndefOr[String] = js.undefined
}

object OmitIOptionsconnectToKern {
  @scala.inline
  def apply(
    model: IModel,
    clientId: String = null,
    kernelConnectionOptions: OmitIOptionsmodelusername = null,
    username: String = null
  ): OmitIOptionsconnectToKern = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (kernelConnectionOptions != null) __obj.updateDynamic("kernelConnectionOptions")(kernelConnectionOptions.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitIOptionsconnectToKern]
  }
}

