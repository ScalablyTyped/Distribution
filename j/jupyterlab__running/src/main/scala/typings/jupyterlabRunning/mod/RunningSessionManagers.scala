package typings.jupyterlabRunning.mod

import typings.jupyterlabRunning.mod.IRunningSessions.IManager
import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/running", "RunningSessionManagers")
@js.native
class RunningSessionManagers () extends IRunningSessionManagers {
  var _managers: js.Any = js.native
  /**
    * Add a running item manager.
    *
    * @param manager - The running item manager.
    *
    */
  /* CompleteClass */
  override def add(manager: IManager): IDisposable = js.native
  /**
    * Return an array of managers.
    */
  /* CompleteClass */
  override def items(): js.Array[IManager] = js.native
}

