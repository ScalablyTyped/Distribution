package typings.jupyterlabStatusbar.mod

import typings.jupyterlabStatusbar.runningSessionsMod.RunningSessions.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/statusbar", "RunningSessions")
@js.native
class RunningSessions protected ()
  extends typings.jupyterlabStatusbar.defaultsMod.RunningSessions {
  /**
    * Create a new RunningSessions widget.
    */
  def this(opts: IOptions) = this()
}
@JSImport("@jupyterlab/statusbar", "RunningSessions")
@js.native
object RunningSessions extends js.Object {
  
  /**
    * A VDomModel for the RunninSessions status item.
    */
  @js.native
  class Model ()
    extends typings.jupyterlabStatusbar.runningSessionsMod.RunningSessions.Model
}
