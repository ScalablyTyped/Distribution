package typings.jupyterlabServices.kernelRestapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<@jupyterlab/services.@jupyterlab/services/lib/kernel/restapi.IModel, 'name'>> */
trait IKernelOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object IKernelOptions {
  @scala.inline
  def apply(name: String = null): IKernelOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelOptions]
  }
}

