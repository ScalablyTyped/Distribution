package typings.kefir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T, S] extends js.Object {
  var end: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ S, Unit]] = js.undefined
  var value: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
}

object Observer {
  @scala.inline
  def apply[T, S](end: () => Unit = null, error: /* error */ S => Unit = null, value: /* value */ T => Unit = null): Observer[T, S] = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(js.Any.fromFunction0(end))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (value != null) __obj.updateDynamic("value")(js.Any.fromFunction1(value))
    __obj.asInstanceOf[Observer[T, S]]
  }
}

