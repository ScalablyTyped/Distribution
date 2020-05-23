package typings.istanbulMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetOnGet extends js.Object {
  var resetOnGet: js.UndefOr[Boolean] = js.undefined
}

object ResetOnGet {
  @scala.inline
  def apply(resetOnGet: js.UndefOr[Boolean] = js.undefined): ResetOnGet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resetOnGet)) __obj.updateDynamic("resetOnGet")(resetOnGet.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetOnGet]
  }
}

