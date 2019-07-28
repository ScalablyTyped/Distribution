package typings.ladda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILaddaOptions extends js.Object {
  var callback: js.UndefOr[js.Function1[/* instance */ ILaddaButton, Unit]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object ILaddaOptions {
  @scala.inline
  def apply(callback: /* instance */ ILaddaButton => Unit = null, timeout: Int | Double = null): ILaddaOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILaddaOptions]
  }
}

