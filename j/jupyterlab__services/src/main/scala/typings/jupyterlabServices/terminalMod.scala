package typings.jupyterlabServices

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.terminalManagerMod.TerminalManager.IOptions
import typings.jupyterlabServices.terminalRestapiMod.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalMod {
  
  object Terminal {
    
    @JSImport("@jupyterlab/services/lib/terminal", "Terminal")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  object TerminalAPI {
    
    @JSImport("@jupyterlab/services/lib/terminal", "TerminalAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@jupyterlab/services/lib/terminal", "TerminalAPI.TERMINAL_SERVICE_URL")
    @js.native
    val TERMINAL_SERVICE_URL: /* "api/terminals" */ String = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
    
    inline def listRunning(): js.Promise[js.Array[IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")().asInstanceOf[js.Promise[js.Array[IModel]]]
    inline def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[IModel]]]
    
    inline def shutdownTerminal(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdownTerminal")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def shutdownTerminal(name: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("shutdownTerminal")(name.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def startNew(): js.Promise[IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")().asInstanceOf[js.Promise[IModel]]
    inline def startNew(settings: ISettings): js.Promise[IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IModel]]
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
