package typings.jupyterlabServices.mod

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.terminalRestapiMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services", "TerminalAPI")
@js.native
object TerminalAPI extends js.Object {
  val TERMINAL_SERVICE_URL: /* "api/terminals" */ String = js.native
  def isAvailable(): Boolean = js.native
  def listRunning(): js.Promise[js.Array[IModel]] = js.native
  def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
  def shutdownTerminal(name: String): js.Promise[Unit] = js.native
  def shutdownTerminal(name: String, settings: ISettings): js.Promise[Unit] = js.native
  def startNew(): js.Promise[IModel] = js.native
  def startNew(settings: ISettings): js.Promise[IModel] = js.native
}

