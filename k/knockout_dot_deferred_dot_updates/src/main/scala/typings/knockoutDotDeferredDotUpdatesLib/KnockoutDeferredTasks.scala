package typings
package knockoutDotDeferredDotUpdatesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutDeferredTasks extends js.Object {
  def makeProcessedCallback(evaluator: js.Function): scala.Unit = js.native
  def processDelayed(evaluator: js.Function): scala.Boolean = js.native
  def processDelayed(evaluator: js.Function, distinct: scala.Boolean): scala.Boolean = js.native
  def processDelayed(evaluator: js.Function, distinct: scala.Boolean, options: js.Array[_]): scala.Boolean = js.native
  def processImmediate(evaluator: js.Function): js.Any = js.native
  def processImmediate(evaluator: js.Function, `object`: js.Any): js.Any = js.native
  def processImmediate(evaluator: js.Function, `object`: js.Any, args: js.Array[_]): js.Any = js.native
}

