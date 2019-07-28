package typings.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////
// tasks.js
//////////////////////////////////
trait KnockoutTasks extends js.Object {
  def cancel(handle: Double): Unit
  def runEarly(): Unit
  def schedule(task: js.Function): Double
  def scheduler(callback: js.Function): js.Any
}

object KnockoutTasks {
  @scala.inline
  def apply(
    cancel: Double => Unit,
    runEarly: () => Unit,
    schedule: js.Function => Double,
    scheduler: js.Function => js.Any
  ): KnockoutTasks = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), runEarly = js.Any.fromFunction0(runEarly), schedule = js.Any.fromFunction1(schedule), scheduler = js.Any.fromFunction1(scheduler))
  
    __obj.asInstanceOf[KnockoutTasks]
  }
}

