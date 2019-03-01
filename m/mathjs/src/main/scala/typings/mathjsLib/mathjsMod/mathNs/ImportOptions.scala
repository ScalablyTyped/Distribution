package typings
package mathjsLib.mathjsMod.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportOptions extends js.Object {
  var `override`: js.UndefOr[scala.Boolean] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

object ImportOptions {
  @scala.inline
  def apply(
    `override`: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): ImportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[ImportOptions]
  }
}

