package typings.jupyterlabRunning.mod

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabRunning.mod.IRunningSessions.IManager
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRunningSessionManagers extends js.Object {
  /**
    * Add a running item manager.
    *
    * @param manager - The running item manager.
    *
    */
  def add(manager: IManager): IDisposable
  /**
    * Return an array of managers.
    */
  def items(): js.Array[IManager]
}

@JSImport("@jupyterlab/running", "IRunningSessionManagers")
@js.native
object IRunningSessionManagers extends TopLevel[Token[IRunningSessionManagers]]

