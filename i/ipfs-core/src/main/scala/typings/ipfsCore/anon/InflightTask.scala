package typings.ipfsCore.anon

import typings.node.NodeJS.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InflightTask extends js.Object {
  
  /** @type {null|Promise<void>} */
  var _inflightTask: Null | js.Promise[Unit] = js.native
  
  /** @type {null|(() => Promise<void>)} */
  var _task: js.Function0[js.Promise[Unit]] | Null = js.native
  
  /** @type {null|NodeJS.Timeout} */
  var _timeoutId: Null | Timeout = js.native
  
  def cancel(): js.Promise[Unit] = js.native
  
  /**
    * @param {function(): number} period
    */
  def runPeriodically(period: js.Function0[Double]): Unit = js.native
}
object InflightTask {
  
  @scala.inline
  def apply(cancel: () => js.Promise[Unit], runPeriodically: js.Function0[Double] => Unit): InflightTask = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), runPeriodically = js.Any.fromFunction1(runPeriodically))
    __obj.asInstanceOf[InflightTask]
  }
  
  @scala.inline
  implicit class InflightTaskOps[Self <: InflightTask] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: () => js.Promise[Unit]): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRunPeriodically(value: js.Function0[Double] => Unit): Self = this.set("runPeriodically", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_inflightTask(value: js.Promise[Unit]): Self = this.set("_inflightTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_inflightTaskNull: Self = this.set("_inflightTask", null)
    
    @scala.inline
    def set_task(value: () => js.Promise[Unit]): Self = this.set("_task", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_taskNull: Self = this.set("_task", null)
    
    @scala.inline
    def set_timeoutId(value: Timeout): Self = this.set("_timeoutId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timeoutIdNull: Self = this.set("_timeoutId", null)
  }
}
