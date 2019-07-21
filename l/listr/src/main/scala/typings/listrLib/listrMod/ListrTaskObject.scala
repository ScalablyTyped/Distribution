package typings
package listrLib.listrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListrTaskObject[Ctx]
  extends rxjsLib.rxjsMod.Observable[ListrEvent] {
  var hasFailed: scala.Boolean = js.native
  var hasSubtasks: scala.Boolean = js.native
  var isCompleted: scala.Boolean = js.native
  var isEnabled: scala.Boolean = js.native
  var isPending: scala.Boolean = js.native
  var isSkipped: scala.Boolean = js.native
  var output: js.UndefOr[java.lang.String] = js.native
  var state: java.lang.String = js.native
  var subtasks: js.Array[ListrTaskWrapper[Ctx]] = js.native
  var title: java.lang.String = js.native
  def check(ctx: Ctx): scala.Unit = js.native
  def run(ctx: Ctx, wrapper: ListrTaskWrapper[Ctx]): js.Promise[scala.Unit] = js.native
  def skip(ctx: Ctx): scala.Unit | scala.Boolean | java.lang.String | js.Promise[scala.Boolean] = js.native
  def task(ctx: Ctx, task: ListrTaskWrapper[Ctx]): scala.Unit | ListrTaskResult[Ctx] = js.native
}

