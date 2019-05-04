package typings
package atJupyterlabTerminalLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/terminal/lib/widget", "Terminal")
@js.native
/**
  * Construct a new terminal widget.
  *
  * @param options - The terminal configuration options.
  */
class Terminal ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  def this(options: stdLib.Partial[atJupyterlabTerminalLib.libWidgetMod.TerminalNs.IOptions]) = this()
  var _initialCommand: js.Any = js.native
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
  /**
    * Resize the terminal based on computed geometry.
    */
  var _resizeTerminal: js.Any = js.native
  var _session: js.Any = js.native
  /**
    * Set the size of the terminal in the session.
    */
  var _setSessionSize: js.Any = js.native
  var _term: js.Any = js.native
  var _termOpened: js.Any = js.native
  var _theme: js.Any = js.native
  /**
    * Get the font size of the terminal in pixels.
    */
  /**
    * Set the font size of the terminal in pixels.
    */
  var fontSize: scala.Double = js.native
  /**
    * The terminal session associated with the widget.
    */
  var session: atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.ISession | scala.Null = js.native
  /**
    * Get the current theme, either light or dark.
    */
  /**
    * Set the current theme, either light or dark.
    */
  var theme: atJupyterlabTerminalLib.libWidgetMod.TerminalNs.Theme = js.native
  /**
    * On resize, use the computed row and column sizes to resize the terminal.
    */
  /* protected */ def onResize(msg: atPhosphorWidgetsLib.atPhosphorWidgetsMod.WidgetNs.ResizeMessage): scala.Unit = js.native
  /**
    * Refresh the terminal session.
    */
  def refresh(): js.Promise[scala.Unit] = js.native
}

