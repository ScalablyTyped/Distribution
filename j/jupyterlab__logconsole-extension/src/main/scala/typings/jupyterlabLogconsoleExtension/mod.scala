package typings.jupyterlabLogconsoleExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApputils.mod.ReactWidget
import typings.jupyterlabLogconsole.mod.LogConsolePanel
import typings.jupyterlabLogconsole.tokensMod.ILoggerRegistry
import typings.react.mod.ChangeEvent
import typings.react.mod.KeyboardEvent
import typings.std.Element
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/logconsole-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  
  val default: js.Array[JupyterFrontEndPlugin[ILoggerRegistry | Unit]] = js.native
}

