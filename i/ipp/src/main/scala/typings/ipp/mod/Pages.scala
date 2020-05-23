package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pages extends js.Object {
  var `full-color`: js.UndefOr[Double] = js.undefined
  var monochrome: js.UndefOr[Double] = js.undefined
}

object Pages {
  @scala.inline
  def apply(`full-color`: js.UndefOr[Double] = js.undefined, monochrome: js.UndefOr[Double] = js.undefined): Pages = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`full-color`)) __obj.updateDynamic("full-color")(`full-color`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monochrome)) __obj.updateDynamic("monochrome")(monochrome.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pages]
  }
}

