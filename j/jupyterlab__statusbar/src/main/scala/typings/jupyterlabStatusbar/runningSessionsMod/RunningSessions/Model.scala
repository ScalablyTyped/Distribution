package typings.jupyterlabStatusbar.runningSessionsMod.RunningSessions

import typings.jupyterlabApputils.vdomMod.VDomModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A VDomModel for the RunninSessions status item.
  */
@JSImport("@jupyterlab/statusbar/lib/defaults/runningSessions", "RunningSessions.Model")
@js.native
class Model () extends VDomModel {
  
  var _sessions: js.Any = js.native
  
  var _terminals: js.Any = js.native
  
  /**
    * The number of active kernel sessions.
    */
  def sessions: Double = js.native
  def sessions_=(sessions: Double): Unit = js.native
  
  /**
    * The number of active terminal sessions.
    */
  def terminals: Double = js.native
  def terminals_=(terminals: Double): Unit = js.native
}
