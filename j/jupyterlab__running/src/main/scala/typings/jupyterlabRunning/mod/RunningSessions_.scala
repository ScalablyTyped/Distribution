package typings.jupyterlabRunning.mod

import typings.jupyterlabApputils.mod.ReactWidget
import typings.jupyterlabRunning.mod.RunningSessions.IOptions
import typings.jupyterlabServices.sessionSessionMod.Session.IModel
import typings.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/running", "RunningSessions")
@js.native
class RunningSessions_ protected () extends ReactWidget {
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
  val terminalOpenRequested: ISignal[this.type, typings.jupyterlabServices.terminalTerminalMod.TerminalSession.IModel] = js.native
}

