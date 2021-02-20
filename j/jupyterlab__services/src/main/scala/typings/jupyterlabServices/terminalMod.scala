package typings.jupyterlabServices

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.terminalManagerMod.TerminalManager.IOptions
import typings.jupyterlabServices.terminalRestapiMod.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalMod {
  
  object Terminal {
    
    @JSImport("@jupyterlab/services/lib/terminal", "Terminal.isAvailable")
    @js.native
    def isAvailable(): Boolean = js.native
  }
  
  object TerminalAPI {
    
    @JSImport("@jupyterlab/services/lib/terminal", "TerminalAPI.TERMINAL_SERVICE_URL")
    @js.native
    val TERMINAL_SERVICE_URL: /* "api/terminals" */ String = js.native
    
    @JSImport("@jupyterlab/services/lib/terminal", "TerminalAPI.isAvailable")
    @js.native
    def isAvailable(): Boolean = js.native
    
    @JSImport("@jupyterlab/services/lib/terminal", "TerminalAPI.listRunning")
    @js.native
    def listRunning(): js.Promise[js.Array[IModel]] = js.native
    @JSImport("@jupyterlab/services/lib/terminal", "TerminalAPI.listRunning")
    @js.native
    def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
    
    @JSImport("@jupyterlab/services/lib/terminal", "TerminalAPI.shutdownTerminal")
    @js.native
    def shutdownTerminal(name: String): js.Promise[Unit] = js.native
    @JSImport("@jupyterlab/services/lib/terminal", "TerminalAPI.shutdownTerminal")
    @js.native
    def shutdownTerminal(name: String, settings: ISettings): js.Promise[Unit] = js.native
    
    @JSImport("@jupyterlab/services/lib/terminal", "TerminalAPI.startNew")
    @js.native
    def startNew(): js.Promise[IModel] = js.native
    @JSImport("@jupyterlab/services/lib/terminal", "TerminalAPI.startNew")
    @js.native
    def startNew(settings: ISettings): js.Promise[IModel] = js.native
  }
  
  @JSImport("@jupyterlab/services/lib/terminal", "TerminalManager")
  @js.native
  /**
    * Construct a new terminal manager.
    */
  class TerminalManager ()
    extends typings.jupyterlabServices.terminalManagerMod.TerminalManager {
    def this(options: IOptions) = this()
  }
}
