package typings.atJupyterlabRunning.atJupyterlabRunningMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.ReactWidget
import typings.atJupyterlabRunning.atJupyterlabRunningMod.RunningSessionsNs.IOptions
import typings.atJupyterlabServices.libSessionSessionMod.SessionNs.IModel
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/running", "RunningSessions")
@js.native
class RunningSessions protected () extends ReactWidget {
  /**
    * Construct a new running widget.
    */
  def this(options: IOptions) = this()
  var _sessionOpenRequested: js.Any = js.native
  var _terminalOpenRequested: js.Any = js.native
  var options: js.Any = js.native
  /**
    * A signal emitted when a kernel session open is requested.
    */
  val sessionOpenRequested: ISignal[this.type, IModel] = js.native
  /**
    * A signal emitted when a terminal session open is requested.
    */
  val terminalOpenRequested: ISignal[
    this.type, 
    typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSessionNs.IModel
  ] = js.native
}

