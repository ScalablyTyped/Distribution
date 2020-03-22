package typings.jupyterlabServices

import typings.jupyterlabServices.kernelRestapiMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/kernel/kernel.IKernelConnection.IOptions, 'serverSettings'> */
trait OmitIOptionsserverSetting extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var handleComms: js.UndefOr[Boolean] = js.undefined
  var model: IModel
  var username: js.UndefOr[String] = js.undefined
}

object OmitIOptionsserverSetting {
  @scala.inline
  def apply(
    model: IModel,
    clientId: String = null,
    handleComms: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): OmitIOptionsserverSetting = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(handleComms)) __obj.updateDynamic("handleComms")(handleComms.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitIOptionsserverSetting]
  }
}

