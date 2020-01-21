package typings.ixJs.Ix

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var onCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
}

object Observer {
  @scala.inline
  def apply[T](
    onCompleted: () => Unit = null,
    onError: /* error */ Error => Unit = null,
    onNext: /* value */ T => Unit = null
  ): Observer[T] = {
    val __obj = js.Dynamic.literal()
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction0(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction1(onNext))
    __obj.asInstanceOf[Observer[T]]
  }
}

