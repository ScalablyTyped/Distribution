package typings.jupyterlabConsole.panelMod

import typings.jupyterlabApputils.mod.MainAreaWidget
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabConsole.panelMod.ConsolePanel.IContentFactory
import typings.jupyterlabConsole.panelMod.ConsolePanel.IOptions
import typings.jupyterlabConsole.widgetMod.CodeConsole
import typings.luminoWidgets.mod.Panel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel")
@js.native
class ConsolePanel_ protected () extends MainAreaWidget[Panel] {
  /**
    * Construct a console panel.
    */
  def this(options: IOptions) = this()
  var _connected: js.Any = js.native
  var _executed: js.Any = js.native
  /**
    * Handle a console execution.
    */
  var _onExecuted: js.Any = js.native
  var _sessionContext: js.Any = js.native
  /**
    * Update the console panel title.
    */
  var _updateTitlePanel: js.Any = js.native
  /**
    * The console widget used by the panel.
    */
  var console: CodeConsole = js.native
  /**
    * The content factory used by the console panel.
    */
  val contentFactory: IContentFactory = js.native
  /**
    * The session used by the panel.
    */
  def sessionContext: ISessionContext = js.native
}

