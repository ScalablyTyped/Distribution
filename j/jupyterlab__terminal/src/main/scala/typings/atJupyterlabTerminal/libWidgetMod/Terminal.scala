package typings.atJupyterlabTerminal.libWidgetMod

import typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSessionNs.ISession
import typings.atJupyterlabTerminal.libTokensMod.ITerminalNs.IOptions
import typings.atJupyterlabTerminal.libTokensMod.ITerminalNs.ITerminal
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.WidgetNs.ResizeMessage
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def this(session: ISession) = this()
  def this(session: ISession, options: Partial[IOptions]) = this()
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

