package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var onComplete: js.UndefOr[js.Function0[_]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ jpmLib.FFAddonSDKNs.NSIException, _]] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(
    onComplete: js.Function0[_] = null,
    onError: js.Function1[/* error */ jpmLib.FFAddonSDKNs.NSIException, _] = null
  ): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    __obj.asInstanceOf[Anon_Error]
  }
}

