package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaSheets extends js.Object {
  var blank: js.UndefOr[Double] = js.undefined
  var `full-color`: js.UndefOr[Double] = js.undefined
  var `highlight-color`: js.UndefOr[Double] = js.undefined
  var monochrome: js.UndefOr[Double] = js.undefined
}

object MediaSheets {
  @scala.inline
  def apply(
    blank: js.UndefOr[Double] = js.undefined,
    `full-color`: js.UndefOr[Double] = js.undefined,
    `highlight-color`: js.UndefOr[Double] = js.undefined,
    monochrome: js.UndefOr[Double] = js.undefined
  ): MediaSheets = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blank)) __obj.updateDynamic("blank")(blank.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`full-color`)) __obj.updateDynamic("full-color")(`full-color`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`highlight-color`)) __obj.updateDynamic("highlight-color")(`highlight-color`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monochrome)) __obj.updateDynamic("monochrome")(monochrome.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSheets]
  }
}

