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

