package typings.atJupyterlabStatusbar.libDefaultsRunningSessionsMod.RunningSessions

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.VDomModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A VDomModel for the RunninSessions status item.
  */
@JSImport("@jupyterlab/statusbar/lib/defaults/runningSessions", "RunningSessions.Model")
@js.native
class Model () extends VDomModel {
  var _kernels: js.Any = js.native
  var _terminals: js.Any = js.native
  /**
    * The number of active kernels.
    */
  var kernels: Double = js.native
  /**
    * The number of active terminal sessions.
    */
  var terminals: Double = js.native
}

