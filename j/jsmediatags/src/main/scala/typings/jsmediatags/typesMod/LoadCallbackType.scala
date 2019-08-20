package typings.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadCallbackType extends js.Object {
  var onError: js.UndefOr[js.Function1[/* error */ jsmediatagsError, Unit]] = js.undefined
  def onSuccess(): Unit
}

object LoadCallbackType {
  @scala.inline
  def apply(onSuccess: () => Unit, onError: /* error */ jsmediatagsError => Unit = null): LoadCallbackType = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction0(onSuccess))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    __obj.asInstanceOf[LoadCallbackType]
  }
}

