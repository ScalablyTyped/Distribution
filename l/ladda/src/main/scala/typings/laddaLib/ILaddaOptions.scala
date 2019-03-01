package typings
package laddaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILaddaOptions extends js.Object {
  var callback: js.UndefOr[js.Function1[/* instance */ ILaddaButton, scala.Unit]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object ILaddaOptions {
  @scala.inline
  def apply(
    callback: js.Function1[/* instance */ ILaddaButton, scala.Unit] = null,
    timeout: scala.Int | scala.Double = null
  ): ILaddaOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILaddaOptions]
  }
}

