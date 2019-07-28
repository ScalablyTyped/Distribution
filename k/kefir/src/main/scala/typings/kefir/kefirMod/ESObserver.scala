package typings.kefir.kefirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ESObserver[T, S] extends js.Object {
  var complete: js.UndefOr[js.Function0[_]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ S, _]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ T, _]] = js.undefined
  var start: js.UndefOr[js.Function] = js.undefined
}

object ESObserver {
  @scala.inline
  def apply[T, S](
    complete: () => _ = null,
    error: /* error */ S => _ = null,
    next: /* value */ T => _ = null,
    start: js.Function = null
  ): ESObserver[T, S] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1(next))
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[ESObserver[T, S]]
  }
}

