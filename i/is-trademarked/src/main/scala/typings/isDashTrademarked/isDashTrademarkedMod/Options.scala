package typings.isDashTrademarked.isDashTrademarkedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var token: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(token: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

