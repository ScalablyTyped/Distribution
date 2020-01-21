package typings.listr.mod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListrTask[Ctx] extends js.Object {
  var enabled: js.UndefOr[
    js.Function1[/* ctx */ Ctx, Boolean | js.Promise[Boolean] | Observable_[Boolean]]
  ] = js.undefined
  var skip: js.UndefOr[js.Function1[/* ctx */ Ctx, Unit | Boolean | String | js.Promise[Boolean]]] = js.undefined
  var title: String
  def task(ctx: Ctx, task: ListrTaskWrapper[Ctx]): Unit | ListrTaskResult[Ctx]
}

object ListrTask {
  @scala.inline
  def apply[Ctx](
    task: (Ctx, ListrTaskWrapper[Ctx]) => Unit | ListrTaskResult[Ctx],
    title: String,
    enabled: /* ctx */ Ctx => Boolean | js.Promise[Boolean] | Observable_[Boolean] = null,
    skip: /* ctx */ Ctx => Unit | Boolean | String | js.Promise[Boolean] = null
  ): ListrTask[Ctx] = {
    val __obj = js.Dynamic.literal(task = js.Any.fromFunction2(task), title = title.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(js.Any.fromFunction1(enabled))
    if (skip != null) __obj.updateDynamic("skip")(js.Any.fromFunction1(skip))
    __obj.asInstanceOf[ListrTask[Ctx]]
  }
}

