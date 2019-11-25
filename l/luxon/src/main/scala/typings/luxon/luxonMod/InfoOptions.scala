package typings.luxon.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoOptions extends js.Object {
  var locale: js.UndefOr[String] = js.undefined
}

object InfoOptions {
  @scala.inline
  def apply(locale: String = null): InfoOptions = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoOptions]
  }
}

