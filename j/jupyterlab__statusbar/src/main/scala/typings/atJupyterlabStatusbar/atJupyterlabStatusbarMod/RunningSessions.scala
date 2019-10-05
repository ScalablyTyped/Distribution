package typings.atJupyterlabStatusbar.atJupyterlabStatusbarMod

import typings.atJupyterlabStatusbar.libDefaultsRunningSessionsMod.RunningSessions.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar", "RunningSessions")
@js.native
class RunningSessions protected ()
  extends typings.atJupyterlabStatusbar.libDefaultsMod.RunningSessions {
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
    extends typings.atJupyterlabStatusbar.libDefaultsMod.RunningSessions.Model
  
}

