package typings.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackType extends js.Object {
  var onError: js.UndefOr[js.Function1[/* error */ jsmediatagsError, Unit]] = js.undefined
  def onSuccess(data: TagType): Unit
}

object CallbackType {
  @scala.inline
  def apply(onSuccess: TagType => Unit, onError: /* error */ jsmediatagsError => Unit = null): CallbackType = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction1(onSuccess))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    __obj.asInstanceOf[CallbackType]
  }
}

