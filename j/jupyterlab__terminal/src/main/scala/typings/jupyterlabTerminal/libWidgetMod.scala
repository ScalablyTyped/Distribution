package typings.jupyterlabTerminal

import typings.jupyterlabServices.libTerminalTerminalMod.ITerminalConnection
import typings.jupyterlabTerminal.anon.PartialIOptions
import typings.jupyterlabTerminal.libTokensMod.ITerminal.ITerminal
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoWidgets.mod.Widget.ResizeMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWidgetMod {
  
  @JSImport("@jupyterlab/terminal/lib/widget", "Terminal")
  @js.native
  open class Terminal protected () extends ITerminal {
    /**
      * Construct a new terminal widget.
      *
      * @param session - The terminal session object.
      *
      * @param options - The terminal configuration options.
      *
      * @param translator - The language translator.
      */
    def this(session: ITerminalConnection) = this()
    def this(session: ITerminalConnection, options: PartialIOptions) = this()
    def this(session: ITerminalConnection, options: Unit, translator: ITranslator) = this()
    def this(session: ITerminalConnection, options: PartialIOptions, translator: ITranslator) = this()
    
    /* private */ val _fitAddon: Any = js.native
    
    /* private */ var _initialConnection: Any = js.native
    
    /**
      * Initialize the terminal object.
      */
    /* private */ var _initializeTerm: Any = js.native
    
    /* private */ var _needsResize: Any = js.native
    
    /* private */ var _offsetHeight: Any = js.native
    
    /* private */ var _offsetWidth: Any = js.native
    
    /**
      * Handle a message from the terminal session.
      */
    /* private */ var _onMessage: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /**
      * Resize the terminal based on computed geometry.
      */
    /* private */ var _resizeTerminal: Any = js.native
    
    /**
      * Set the size of the terminal in the session.
      */
    /* private */ var _setSessionSize: Any = js.native
    
    /* private */ var _setThemeAttribute: Any = js.native
    
    /* private */ val _term: Any = js.native
    
    /* private */ var _termOpened: Any = js.native
    
    /* private */ var _trans: Any = js.native
    
    /**
      * On resize, use the computed row and column sizes to resize the terminal.
      */
    /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
  }
}
