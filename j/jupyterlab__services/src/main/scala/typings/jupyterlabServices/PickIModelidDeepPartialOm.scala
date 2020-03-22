package typings.jupyterlabServices

import typings.jupyterlabServices.kernelRestapiMod.IModel
import typings.jupyterlabServices.sessionRestapiMod.DeepPartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@jupyterlab/services.@jupyterlab/services/lib/session.Session.IModel, 'id'> & @jupyterlab/services.@jupyterlab/services/lib/session/restapi.DeepPartial<std.Omit<@jupyterlab/services.@jupyterlab/services/lib/session.Session.IModel, 'id'>> */
trait PickIModelidDeepPartialOm extends js.Object {
  var id: String
  var kernel: js.UndefOr[DeepPartial[js.UndefOr[IModel]]] = js.undefined
  var name: js.UndefOr[DeepPartial[String]] = js.undefined
  var path: js.UndefOr[DeepPartial[String]] = js.undefined
  var `type`: js.UndefOr[DeepPartial[String]] = js.undefined
}

object PickIModelidDeepPartialOm {
  @scala.inline
  def apply(
    id: String,
    kernel: DeepPartial[js.UndefOr[IModel]] = null,
    name: DeepPartial[String] = null,
    path: DeepPartial[String] = null,
    `type`: DeepPartial[String] = null
  ): PickIModelidDeepPartialOm = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (kernel != null) __obj.updateDynamic("kernel")(kernel.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIModelidDeepPartialOm]
  }
}

