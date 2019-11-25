package typings.istanbulDashMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResetOnGet extends js.Object {
  var resetOnGet: js.UndefOr[Boolean] = js.undefined
}

object Anon_ResetOnGet {
  @scala.inline
  def apply(resetOnGet: js.UndefOr[Boolean] = js.undefined): Anon_ResetOnGet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resetOnGet)) __obj.updateDynamic("resetOnGet")(resetOnGet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ResetOnGet]
  }
}

