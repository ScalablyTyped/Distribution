package typings.jshamcrest.JsHamcrest.Operators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the options accepted by assert().
  */
trait AssertOptions extends js.Object {
  var fail: js.UndefOr[js.Function1[/* description */ String, Unit]] = js.undefined
  var message: js.UndefOr[js.Any] = js.undefined
  var pass: js.UndefOr[js.Function1[/* description */ String, Unit]] = js.undefined
}

object AssertOptions {
  @scala.inline
  def apply(
    fail: /* description */ String => Unit = null,
    message: js.Any = null,
    pass: /* description */ String => Unit = null
  ): AssertOptions = {
    val __obj = js.Dynamic.literal()
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (pass != null) __obj.updateDynamic("pass")(js.Any.fromFunction1(pass))
    __obj.asInstanceOf[AssertOptions]
  }
}

