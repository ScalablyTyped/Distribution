package typings.jpm

import typings.jpm.FFAddonSDK.NSIException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var onComplete: js.UndefOr[js.Function0[_]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ NSIException, _]] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(onComplete: () => _ = null, onError: /* error */ NSIException => _ = null): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction0(onComplete))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    __obj.asInstanceOf[Anon_Error]
  }
}

