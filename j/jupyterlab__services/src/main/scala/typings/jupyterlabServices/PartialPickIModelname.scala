package typings.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<@jupyterlab/services.@jupyterlab/services/lib/kernel.Kernel.IModel, 'name'>> */
trait PartialPickIModelname extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object PartialPickIModelname {
  @scala.inline
  def apply(name: String = null): PartialPickIModelname = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickIModelname]
  }
}

