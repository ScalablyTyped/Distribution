package typings.atJupyterlabTerminal

import typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession.ISession
import typings.atJupyterlabTerminal.libTokensMod.ITerminal.IOptions
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/terminal", JSImport.Namespace)
@js.native
object atJupyterlabTerminalMod extends js.Object {
  @js.native
  class Terminal protected ()
    extends typings.atJupyterlabTerminal.libWidgetMod.Terminal {
    /**
      * Construct a new terminal widget.
      *
      * @param session - The terminal session object.
      *
      * @param options - The terminal configuration options.
      */
    def this(session: ISession) = this()
    def this(session: ISession, options: Partial[IOptions]) = this()
  }
  
  val ITerminalTracker: Token[typings.atJupyterlabTerminal.libTokensMod.ITerminalTracker] = js.native
  @js.native
  object ITerminal extends js.Object {
    /**
      * The default options used for creating terminals.
      */
    val defaultOptions: IOptions = js.native
  }
  
}

