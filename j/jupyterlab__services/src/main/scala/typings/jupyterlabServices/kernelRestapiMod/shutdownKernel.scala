package typings.jupyterlabServices.kernelRestapiMod

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/restapi", "shutdownKernel")
@js.native
object shutdownKernel extends js.Object {
  def apply(id: String): js.Promise[Unit] = js.native
  def apply(id: String, settings: ISettings): js.Promise[Unit] = js.native
}

