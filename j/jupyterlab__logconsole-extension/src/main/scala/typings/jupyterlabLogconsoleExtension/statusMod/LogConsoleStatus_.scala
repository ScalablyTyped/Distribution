package typings.jupyterlabLogconsoleExtension.statusMod

import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabLogconsoleExtension.statusMod.LogConsoleStatus.IOptions
import typings.jupyterlabLogconsoleExtension.statusMod.LogConsoleStatus.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/logconsole-extension/lib/status", "LogConsoleStatus")
@js.native
class LogConsoleStatus_ protected () extends VDomRenderer[Model] {
  /**
    * Construct the log console status widget.
    *
    * @param options - The status widget initialization options.
    */
  def this(options: IOptions) = this()
  
  var _clearHighlight: js.Any = js.native
  
  var _flashHighlight: js.Any = js.native
  
  var _handleClick: js.Any = js.native
  
  var _showHighlighted: js.Any = js.native
}
