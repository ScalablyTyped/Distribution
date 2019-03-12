package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////
// tasks.js
//////////////////////////////////
trait KnockoutTasks extends js.Object {
  def cancel(handle: scala.Double): scala.Unit
  def runEarly(): scala.Unit
  def schedule(task: js.Function): scala.Double
  def scheduler(callback: js.Function): js.Any
}

object KnockoutTasks {
  @scala.inline
  def apply(
    cancel: scala.Double => scala.Unit,
    runEarly: () => scala.Unit,
    schedule: js.Function => scala.Double,
    scheduler: js.Function => js.Any
  ): KnockoutTasks = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), runEarly = js.Any.fromFunction0(runEarly), schedule = js.Any.fromFunction1(schedule), scheduler = js.Any.fromFunction1(scheduler))
  
    __obj.asInstanceOf[KnockoutTasks]
  }
}

