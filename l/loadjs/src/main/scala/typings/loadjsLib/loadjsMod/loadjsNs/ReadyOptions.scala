package typings
package loadjsLib.loadjsMod.loadjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadyOptions extends js.Object {
  var error: js.UndefOr[js.Function1[/* depsNotFound */ java.lang.String, scala.Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object ReadyOptions {
  @scala.inline
  def apply(
    error: js.Function1[/* depsNotFound */ java.lang.String, scala.Unit] = null,
    success: js.Function0[scala.Unit] = null
  ): ReadyOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ReadyOptions]
  }
}

