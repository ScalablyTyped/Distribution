package typings.atJupyterlabTerminal.libMod

import typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSessionNs.ISession
import typings.atJupyterlabTerminal.libTokensMod.ITerminalNs.IOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/terminal/lib", "Terminal")
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

