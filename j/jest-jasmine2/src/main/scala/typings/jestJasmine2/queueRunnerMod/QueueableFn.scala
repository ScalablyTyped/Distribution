package typings.jestJasmine2.queueRunnerMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueableFn extends js.Object {
  var initError: js.UndefOr[Error] = js.undefined
  var timeout: js.UndefOr[js.Function0[Double]] = js.undefined
  def fn(done: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit
}

object QueueableFn {
  @scala.inline
  def apply(
    fn: js.Function1[/* error */ js.UndefOr[js.Any], Unit] => Unit,
    initError: Error = null,
    timeout: () => Double = null
  ): QueueableFn = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn))
    if (initError != null) __obj.updateDynamic("initError")(initError.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(js.Any.fromFunction0(timeout))
    __obj.asInstanceOf[QueueableFn]
  }
}

