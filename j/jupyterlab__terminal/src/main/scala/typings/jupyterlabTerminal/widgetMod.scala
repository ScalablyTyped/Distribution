package typings.jupyterlabTerminal

import typings.jupyterlabServices.terminalTerminalMod.ITerminalConnection
import typings.jupyterlabTerminal.anon.PartialIOptions
import typings.jupyterlabTerminal.tokensMod.ITerminal.ITerminal
import typings.luminoWidgets.mod.Widget.ResizeMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/terminal/lib/widget", JSImport.Namespace)
@js.native
object widgetMod extends js.Object {
  
  @js.native
  class Terminal protected () extends ITerminal {
    /**
      * Construct a new terminal widget.
      *
      * @param session - The terminal session object.
      *
      * @param options - The terminal configuration options.
      */
    def this(session: ITerminalConnection) = this()
    def this(session: ITerminalConnection, options: PartialIOptions) = this()
    
    val _fitAddon: js.Any = js.native
    
    var _initialConnection: js.Any = js.native
    
    /**
      * Initialize the terminal object.
      */
    var _initializeTerm: js.Any = js.native
    
    var _needsResize: js.Any = js.native
    
    var _offsetHeight: js.Any = js.native
    
    var _offsetWidth: js.Any = js.native
    
    /**
      * Handle a message from the terminal session.
      */
    var _onMessage: js.Any = js.native
    
    var _options: js.Any = js.native
    
    /**
      * Resize the terminal based on computed geometry.
      */
    var _resizeTerminal: js.Any = js.native
    
    /**
      * Set the size of the terminal in the session.
      */
    var _setSessionSize: js.Any = js.native
    
    val _term: js.Any = js.native
    
    var _termOpened: js.Any = js.native
    
    /**
      * On resize, use the computed row and column sizes to resize the terminal.
      */
    /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
  }
}
