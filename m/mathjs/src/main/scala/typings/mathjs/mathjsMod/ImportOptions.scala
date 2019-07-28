package typings.mathjs.mathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportOptions extends js.Object {
  var `override`: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object ImportOptions {
  @scala.inline
  def apply(
    `override`: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): ImportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[ImportOptions]
  }
}

