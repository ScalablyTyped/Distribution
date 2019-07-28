package typings.listr.listrMod

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListrTaskObject[Ctx] extends Observable[ListrEvent] {
  var hasFailed: Boolean = js.native
  var hasSubtasks: Boolean = js.native
  var isCompleted: Boolean = js.native
  var isEnabled: Boolean = js.native
  var isPending: Boolean = js.native
  var isSkipped: Boolean = js.native
  var output: js.UndefOr[String] = js.native
  var state: String = js.native
  var subtasks: js.Array[ListrTaskWrapper[Ctx]] = js.native
  var title: String = js.native
  def check(ctx: Ctx): Unit = js.native
  def run(ctx: Ctx, wrapper: ListrTaskWrapper[Ctx]): js.Promise[Unit] = js.native
  def skip(ctx: Ctx): Unit | Boolean | String | js.Promise[Boolean] = js.native
  def task(ctx: Ctx, task: ListrTaskWrapper[Ctx]): Unit | ListrTaskResult[Ctx] = js.native
}

