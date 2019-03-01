package typings
package jjvLib.jjvMod.jjvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var checkRequired: js.UndefOr[scala.Boolean] = js.undefined
  var removeAdditional: js.UndefOr[scala.Boolean] = js.undefined
  var useCoerce: js.UndefOr[scala.Boolean] = js.undefined
  var useDefault: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    checkRequired: js.UndefOr[scala.Boolean] = js.undefined,
    removeAdditional: js.UndefOr[scala.Boolean] = js.undefined,
    useCoerce: js.UndefOr[scala.Boolean] = js.undefined,
    useDefault: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkRequired)) __obj.updateDynamic("checkRequired")(checkRequired)
    if (!js.isUndefined(removeAdditional)) __obj.updateDynamic("removeAdditional")(removeAdditional)
    if (!js.isUndefined(useCoerce)) __obj.updateDynamic("useCoerce")(useCoerce)
    if (!js.isUndefined(useDefault)) __obj.updateDynamic("useDefault")(useDefault)
    __obj.asInstanceOf[Options]
  }
}

