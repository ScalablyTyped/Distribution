package typings.atJupyterlabLogconsoleDashExtension

import typings.atJupyterlabApplication.atJupyterlabApplicationMod.JupyterFrontEnd
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.atJupyterlabApputils.atJupyterlabApputilsMod.ReactWidget
import typings.atJupyterlabLogconsole.atJupyterlabLogconsoleMod.LogConsolePanel
import typings.atJupyterlabLogconsole.libTokensMod.ILoggerRegistry
import typings.atPhosphorApplication.atPhosphorApplicationMod.IPlugin
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.KeyboardEvent
import typings.std.Element
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/logconsole-extension", JSImport.Namespace)
@js.native
object atJupyterlabLogconsoleDashExtensionMod extends js.Object {
  @js.native
  class LogLevelSwitcher protected () extends ReactWidget {
    /**
      * Construct a new cell type switcher.
      */
    def this(widget: LogConsolePanel) = this()
    var _id: js.Any = js.native
    var _logConsole: js.Any = js.native
    var _updateSource: js.Any = js.native
    /**
      * Handle `change` events for the HTMLSelect component.
      */
    def handleChange(event: ChangeEvent[HTMLSelectElement]): Unit = js.native
    /**
      * Handle `keydown` events for the HTMLSelect component.
      */
    def handleKeyDown(event: KeyboardEvent[Element]): Unit = js.native
  }
  
  val default: js.Array[IPlugin[JupyterFrontEnd[IShell], ILoggerRegistry | Unit]] = js.native
}

