package typings.joi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapArrays extends js.Object {
  var wrapArrays: js.UndefOr[Boolean] = js.undefined
}

object WrapArrays {
  @scala.inline
  def apply(wrapArrays: js.UndefOr[Boolean] = js.undefined): WrapArrays = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(wrapArrays)) __obj.updateDynamic("wrapArrays")(wrapArrays.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapArrays]
  }
}

