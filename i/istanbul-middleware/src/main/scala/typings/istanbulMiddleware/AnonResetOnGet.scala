package typings.istanbulMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResetOnGet extends js.Object {
  var resetOnGet: js.UndefOr[Boolean] = js.undefined
}

object AnonResetOnGet {
  @scala.inline
  def apply(resetOnGet: js.UndefOr[Boolean] = js.undefined): AnonResetOnGet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resetOnGet)) __obj.updateDynamic("resetOnGet")(resetOnGet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResetOnGet]
  }
}

