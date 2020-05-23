package typings.jupyterlabServices.sessionSessionMod

import typings.jupyterlabServices.anon.PartialPickIModelname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@jupyterlab/services.@jupyterlab/services/lib/session/session.IModel, 'path' | 'type' | 'name'> & {  kernel ? :std.Partial<std.Pick<@jupyterlab/services.@jupyterlab/services/lib/kernel.Kernel.IModel, 'name'>>} */
trait ISessionOptions extends js.Object {
  var kernel: js.UndefOr[PartialPickIModelname] = js.undefined
  var name: String
  var path: String
  var `type`: String
}

object ISessionOptions {
  @scala.inline
  def apply(name: String, path: String, `type`: String, kernel: PartialPickIModelname = null): ISessionOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (kernel != null) __obj.updateDynamic("kernel")(kernel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISessionOptions]
  }
}

