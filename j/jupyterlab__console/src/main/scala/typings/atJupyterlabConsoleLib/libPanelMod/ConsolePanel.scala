package typings
package atJupyterlabConsoleLib.libPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel")
@js.native
class ConsolePanel protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Panel {
  /**
    * Construct a console panel.
    */
  def this(options: atJupyterlabConsoleLib.libPanelMod.ConsolePanelNs.IOptions) = this()
  var _connected: js.Any = js.native
  var _executed: js.Any = js.native
  /**
    * Handle a console execution.
    */
  var _onExecuted: js.Any = js.native
  var _session: js.Any = js.native
  /**
    * Update the console panel title.
    */
  var _updateTitle: js.Any = js.native
  /**
    * The console widget used by the panel.
    */
  val console: atJupyterlabConsoleLib.libWidgetMod.CodeConsole = js.native
  /**
    * The content factory used by the console panel.
    */
  val contentFactory: atJupyterlabConsoleLib.libPanelMod.ConsolePanelNs.IContentFactory = js.native
  /**
    * The session used by the panel.
    */
  val session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession = js.native
}

