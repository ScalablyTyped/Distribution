package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@jupyterlab/services.@jupyterlab/services/lib/kernel/kernel.IKernelConnection.IOptions, 'clientId' | 'username' | 'handleComms'> */
trait PickIOptionsclientIdusern extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var handleComms: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object PickIOptionsclientIdusern {
  @scala.inline
  def apply(clientId: String = null, handleComms: js.UndefOr[Boolean] = js.undefined, username: String = null): PickIOptionsclientIdusern = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(handleComms)) __obj.updateDynamic("handleComms")(handleComms.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIOptionsclientIdusern]
  }
}

