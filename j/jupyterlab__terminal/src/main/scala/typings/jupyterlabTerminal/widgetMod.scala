package typings.jupyterlabTerminal

import typings.jupyterlabServices.terminalTerminalMod.ITerminalConnection
import typings.jupyterlabTerminal.anon.PartialIOptions
import typings.jupyterlabTerminal.tokensMod.ITerminal.ITerminal
import typings.luminoWidgets.mod.Widget.ResizeMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@jupyterlab/terminal/lib/widget", "Terminal")
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
    
    /* private */ val _fitAddon: js.Any = js.native
    
    /* private */ var _initialConnection: js.Any = js.native
    
    /**
      * Initialize the terminal object.
      */
    /* private */ var _initializeTerm: js.Any = js.native
    
    /* private */ var _needsResize: js.Any = js.native
    
    /* private */ var _offsetHeight: js.Any = js.native
    
    /* private */ var _offsetWidth: js.Any = js.native
    
    /**
      * Handle a message from the terminal session.
      */
    /* private */ var _onMessage: js.Any = js.native
    
    /* private */ var _options: js.Any = js.native
    
    /**
      * Resize the terminal based on computed geometry.
      */
    /* private */ var _resizeTerminal: js.Any = js.native
    
    /**
      * Set the size of the terminal in the session.
      */
    /* private */ var _setSessionSize: js.Any = js.native
    
    /* private */ val _term: js.Any = js.native
    
    /* private */ var _termOpened: js.Any = js.native
    
    /**
      * On resize, use the computed row and column sizes to resize the terminal.
      */
    /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
  }
}
