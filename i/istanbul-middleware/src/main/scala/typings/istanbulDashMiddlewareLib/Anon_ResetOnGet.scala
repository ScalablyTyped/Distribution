package typings
package istanbulDashMiddlewareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResetOnGet extends js.Object {
  var resetOnGet: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ResetOnGet {
  @scala.inline
  def apply(resetOnGet: js.UndefOr[scala.Boolean] = js.undefined): Anon_ResetOnGet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resetOnGet)) __obj.updateDynamic("resetOnGet")(resetOnGet)
    __obj.asInstanceOf[Anon_ResetOnGet]
  }
}

