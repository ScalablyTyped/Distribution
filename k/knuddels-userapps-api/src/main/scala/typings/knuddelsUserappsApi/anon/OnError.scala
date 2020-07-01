package typings.knuddelsUserappsApi.anon

import typings.knuddelsUserappsApi.mod.global.KnuddelAmount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnError extends js.Object {
  var onError: js.UndefOr[
    js.Function3[/* knuddelAmount */ KnuddelAmount, /* reason */ String, /* message */ String, Unit]
  ] = js.undefined
  var onSuccess: js.UndefOr[js.Function2[/* knuddelAmount */ KnuddelAmount, /* reason */ String, Unit]] = js.undefined
}

object OnError {
  @scala.inline
  def apply(
    onError: (/* knuddelAmount */ KnuddelAmount, /* reason */ String, /* message */ String) => Unit = null,
    onSuccess: (/* knuddelAmount */ KnuddelAmount, /* reason */ String) => Unit = null
  ): OnError = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction3(onError))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction2(onSuccess))
    __obj.asInstanceOf[OnError]
  }
}

