package typings.hapiAuthCookie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectTo extends js.Object {
  var redirectTo: js.UndefOr[Boolean] = js.undefined
}

object RedirectTo {
  @scala.inline
  def apply(redirectTo: js.UndefOr[Boolean] = js.undefined): RedirectTo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(redirectTo)) __obj.updateDynamic("redirectTo")(redirectTo.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectTo]
  }
}

