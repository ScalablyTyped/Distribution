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
    cancel: js.Function1[scala.Double, scala.Unit],
    runEarly: js.Function0[scala.Unit],
    schedule: js.Function1[js.Function, scala.Double],
    scheduler: js.Function1[js.Function, js.Any]
  ): KnockoutTasks = {
    val __obj = js.Dynamic.literal(cancel = cancel, runEarly = runEarly, schedule = schedule, scheduler = scheduler)
  
    __obj.asInstanceOf[KnockoutTasks]
  }
}

