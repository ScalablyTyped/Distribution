package typings.jupyterlabServices.terminalRestapiMod

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/terminal/restapi", "shutdownTerminal")
@js.native
object shutdownTerminal extends js.Object {
  def apply(name: String): js.Promise[Unit] = js.native
  def apply(name: String, settings: ISettings): js.Promise[Unit] = js.native
}

