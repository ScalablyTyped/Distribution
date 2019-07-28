package typings.atJupyterlabStatusbar.libDefaultsRunningSessionsMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.VDomModel
import typings.atJupyterlabServices.atJupyterlabServicesMod.ServiceManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar/lib/defaults/runningSessions", "RunningSessions")
@js.native
object RunningSessionsNs extends js.Object {
  /**
    * Options for creating a RunningSessions item.
    */
  trait IOptions extends js.Object {
    /**
      * The application service manager.
      */
    var serviceManager: ServiceManager
    /**
      * A click handler for the item. By defult this is used
      * to activate the running sessions side panel.
      */
    def onClick(): Unit
  }
  
  /**
    * A VDomModel for the RunninSessions status item.
    */
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
  
}

