package typings.jupyterlabRunning.mod.IRunningSessions

import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A manager of running items grouped under a single section.
  */
@js.native
trait IManager extends js.Object {
  
  var name: String = js.native
  
  def refreshRunning(): Unit = js.native
  
  def running(): js.Array[IRunningItem] = js.native
  
  var runningChanged: ISignal[_, _] = js.native
  
  def shutdownAll(): Unit = js.native
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
  
  @scala.inline
  implicit class IManagerOps[Self <: IManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshRunning(value: () => Unit): Self = this.set("refreshRunning", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRunning(value: () => js.Array[IRunningItem]): Self = this.set("running", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRunningChanged(value: ISignal[_, _]): Self = this.set("runningChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShutdownAll(value: () => Unit): Self = this.set("shutdownAll", js.Any.fromFunction0(value))
  }
}
