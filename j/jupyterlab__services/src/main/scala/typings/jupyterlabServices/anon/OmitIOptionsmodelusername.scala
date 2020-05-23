package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/kernel.Kernel.IKernelConnection.IOptions, 'model' | 'username' | 'clientId' | 'serverSettings'> */
trait OmitIOptionsmodelusername extends js.Object {
  var handleComms: js.UndefOr[Boolean] = js.undefined
}

object OmitIOptionsmodelusername {
  @scala.inline
  def apply(handleComms: js.UndefOr[Boolean] = js.undefined): OmitIOptionsmodelusername = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(handleComms)) __obj.updateDynamic("handleComms")(handleComms.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitIOptionsmodelusername]
  }
}

