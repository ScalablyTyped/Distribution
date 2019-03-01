package typings
package isDashTrademarkedLib.isDashTrademarkedMod.isTrademarkedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var token: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(token: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Options]
  }
}

