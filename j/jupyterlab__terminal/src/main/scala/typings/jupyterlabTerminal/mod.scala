package typings.jupyterlabTerminal

import typings.jupyterlabServices.terminalTerminalMod.ITerminalConnection
import typings.jupyterlabTerminal.tokensMod.ITerminal.IOptions
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/terminal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Terminal protected ()
    extends typings.jupyterlabTerminal.widgetMod.Terminal {
    /**
      * Construct a new terminal widget.
      *
      * @param session - The terminal session object.
      *
      * @param options - The terminal configuration options.
      */
    def this(session: ITerminalConnection) = this()
    def this(session: ITerminalConnection, options: PartialIOptions) = this()
  }
  
  val ITerminalTracker: Token[typings.jupyterlabTerminal.tokensMod.ITerminalTracker] = js.native
  @js.native
  object ITerminal extends js.Object {
    /**
      * The default options used for creating terminals.
      */
    val defaultOptions: IOptions = js.native
  }
  
}

