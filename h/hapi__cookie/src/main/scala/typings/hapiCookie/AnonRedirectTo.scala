package typings.hapiCookie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRedirectTo extends js.Object {
  var redirectTo: js.UndefOr[Boolean] = js.undefined
}

object AnonRedirectTo {
  @scala.inline
  def apply(redirectTo: js.UndefOr[Boolean] = js.undefined): AnonRedirectTo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(redirectTo)) __obj.updateDynamic("redirectTo")(redirectTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRedirectTo]
  }
}

