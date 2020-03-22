package typings.jupyterlabServices.kernelRestapiMod

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/restapi", "startNew")
@js.native
object startNew extends js.Object {
  def apply(): js.Promise[IModel] = js.native
  def apply(options: IKernelOptions): js.Promise[IModel] = js.native
  def apply(options: IKernelOptions, settings: ISettings): js.Promise[IModel] = js.native
}

