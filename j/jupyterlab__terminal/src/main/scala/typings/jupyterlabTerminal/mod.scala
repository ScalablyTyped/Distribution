package typings.jupyterlabTerminal

import typings.jupyterlabServices.libTerminalTerminalMod.ITerminalConnection
import typings.jupyterlabTerminal.anon.PartialIOptions
import typings.jupyterlabTerminal.libTokensMod.ITerminal.IOptions
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ITerminal {
    
    /**
      * The default options used for creating terminals.
      */
    @JSImport("@jupyterlab/terminal", "ITerminal.defaultOptions")
    @js.native
    val defaultOptions: IOptions = js.native
  }
  
  @JSImport("@jupyterlab/terminal", "ITerminalTracker")
  @js.native
  val ITerminalTracker: Token[typings.jupyterlabTerminal.libTokensMod.ITerminalTracker] = js.native
  
  @JSImport("@jupyterlab/terminal", "Terminal")
  @js.native
  open class Terminal protected ()
    extends typings.jupyterlabTerminal.libWidgetMod.Terminal {
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
  }
}
