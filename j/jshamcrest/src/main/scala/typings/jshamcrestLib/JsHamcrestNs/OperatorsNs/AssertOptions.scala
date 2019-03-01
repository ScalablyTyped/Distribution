package typings
package jshamcrestLib.JsHamcrestNs.OperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the options accepted by assert().
  */
trait AssertOptions extends js.Object {
  var fail: js.UndefOr[js.Function1[/* description */ java.lang.String, scala.Unit]] = js.undefined
  var message: js.UndefOr[js.Any] = js.undefined
  var pass: js.UndefOr[js.Function1[/* description */ java.lang.String, scala.Unit]] = js.undefined
}

object AssertOptions {
  @scala.inline
  def apply(
    fail: js.Function1[/* description */ java.lang.String, scala.Unit] = null,
    message: js.Any = null,
    pass: js.Function1[/* description */ java.lang.String, scala.Unit] = null
  ): AssertOptions = {
    val __obj = js.Dynamic.literal()
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (message != null) __obj.updateDynamic("message")(message)
    if (pass != null) __obj.updateDynamic("pass")(pass)
    __obj.asInstanceOf[AssertOptions]
  }
}

