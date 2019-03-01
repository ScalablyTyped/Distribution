package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoOptions extends js.Object {
  var locale: js.UndefOr[java.lang.String] = js.undefined
}

object InfoOptions {
  @scala.inline
  def apply(locale: java.lang.String = null): InfoOptions = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[InfoOptions]
  }
}

