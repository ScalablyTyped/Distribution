package typings
package ixDotJsLib.IxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var onCompleted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
}

object Observer {
  @scala.inline
  def apply[T](
    onCompleted: js.Function0[scala.Unit] = null,
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit] = null,
    onNext: js.Function1[/* value */ T, scala.Unit] = null
  ): Observer[T] = {
    val __obj = js.Dynamic.literal()
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(onCompleted)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onNext != null) __obj.updateDynamic("onNext")(onNext)
    __obj.asInstanceOf[Observer[T]]
  }
}

