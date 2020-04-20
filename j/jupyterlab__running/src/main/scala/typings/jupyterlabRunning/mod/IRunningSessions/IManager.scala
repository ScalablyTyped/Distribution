package typings.jupyterlabRunning.mod.IRunningSessions

import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A manager of running items grouped under a single section.
  */
trait IManager extends js.Object {
  var name: String
  var runningChanged: ISignal[_, _]
  def refreshRunning(): Unit
  def running(): js.Array[IRunningItem]
  def shutdownAll(): Unit
}

object IManager {
  @scala.inline
  def apply(
    name: String,
    refreshRunning: () => Unit,
    running: () => js.Array[IRunningItem],
    runningChanged: ISignal[_, _],
    shutdownAll: () => Unit
  ): IManager = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], refreshRunning = js.Any.fromFunction0(refreshRunning), running = js.Any.fromFunction0(running), runningChanged = runningChanged.asInstanceOf[js.Any], shutdownAll = js.Any.fromFunction0(shutdownAll))
    __obj.asInstanceOf[IManager]
  }
}

