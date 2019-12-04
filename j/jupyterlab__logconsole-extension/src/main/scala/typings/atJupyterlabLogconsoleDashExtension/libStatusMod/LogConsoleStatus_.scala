package typings.atJupyterlabLogconsoleDashExtension.libStatusMod

import typings.atJupyterlabApputils.libVdomMod.VDomRenderer
import typings.atJupyterlabLogconsoleDashExtension.libStatusMod.LogConsoleStatus.IOptions
import typings.atJupyterlabLogconsoleDashExtension.libStatusMod.LogConsoleStatus.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

