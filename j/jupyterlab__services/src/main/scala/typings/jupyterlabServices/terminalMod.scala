package typings.jupyterlabServices

import typings.jupyterlabServices.jupyterlabServicesStrings.apiSlashterminals
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.terminalManagerMod.TerminalManager.IOptions
import typings.jupyterlabServices.terminalRestapiMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/terminal", JSImport.Namespace)
@js.native
object terminalMod extends js.Object {
  @js.native
  /**
    * Construct a new terminal manager.
    */
  class TerminalManager ()
    extends typings.jupyterlabServices.terminalManagerMod.TerminalManager {
    def this(options: IOptions) = this()
  }
  
  @js.native
  object Terminal extends js.Object {
    def isAvailable(): Boolean = js.native
  }
  
  @js.native
  object TerminalAPI extends js.Object {
    val TERMINAL_SERVICE_URL: apiSlashterminals = js.native
    def isAvailable(): Boolean = js.native
    def listRunning(): js.Promise[js.Array[IModel]] = js.native
    def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
    def shutdownTerminal(name: String): js.Promise[Unit] = js.native
    def shutdownTerminal(name: String, settings: ISettings): js.Promise[Unit] = js.native
    def startNew(): js.Promise[IModel] = js.native
    def startNew(settings: ISettings): js.Promise[IModel] = js.native
  }
  
}

