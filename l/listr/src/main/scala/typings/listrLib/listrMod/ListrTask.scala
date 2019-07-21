package typings
package listrLib.listrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListrTask[Ctx] extends js.Object {
  var enabled: js.UndefOr[
    js.Function1[
      /* ctx */ Ctx, 
      scala.Boolean | js.Promise[scala.Boolean] | rxjsLib.rxjsMod.Observable[scala.Boolean]
    ]
  ] = js.undefined
  var skip: js.UndefOr[
    js.Function1[
      /* ctx */ Ctx, 
      scala.Unit | scala.Boolean | java.lang.String | js.Promise[scala.Boolean]
    ]
  ] = js.undefined
  var title: java.lang.String
  def task(ctx: Ctx, task: ListrTaskWrapper[Ctx]): scala.Unit | ListrTaskResult[Ctx]
}

object ListrTask {
  @scala.inline
  def apply[Ctx](
    task: (Ctx, ListrTaskWrapper[Ctx]) => scala.Unit | ListrTaskResult[Ctx],
    title: java.lang.String,
    enabled: /* ctx */ Ctx => scala.Boolean | js.Promise[scala.Boolean] | rxjsLib.rxjsMod.Observable[scala.Boolean] = null,
    skip: /* ctx */ Ctx => scala.Unit | scala.Boolean | java.lang.String | js.Promise[scala.Boolean] = null
  ): ListrTask[Ctx] = {
    val __obj = js.Dynamic.literal(task = js.Any.fromFunction2(task), title = title)
    if (enabled != null) __obj.updateDynamic("enabled")(js.Any.fromFunction1(enabled))
    if (skip != null) __obj.updateDynamic("skip")(js.Any.fromFunction1(skip))
    __obj.asInstanceOf[ListrTask[Ctx]]
  }
}

