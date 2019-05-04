package typings
package atJupyterlabRunningLib.atJupyterlabRunningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/running", "RunningSessions")
@js.native
class RunningSessions protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a new running widget.
    */
  def this(options: atJupyterlabRunningLib.atJupyterlabRunningMod.RunningSessionsNs.IOptions) = this()
  var _sessionOpenRequested: js.Any = js.native
  var _terminalOpenRequested: js.Any = js.native
  var options: js.Any = js.native
  /**
    * A signal emitted when a kernel session open is requested.
    */
  val sessionOpenRequested: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabServicesLib.libSessionSessionMod.SessionNs.IModel] = js.native
  /**
    * A signal emitted when a terminal session open is requested.
    */
  val terminalOpenRequested: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.IModel] = js.native
}

