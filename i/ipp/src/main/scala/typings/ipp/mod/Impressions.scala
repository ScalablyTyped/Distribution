package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impressions extends js.Object {
  var blank: js.UndefOr[Double] = js.undefined
  var `blank-two-sided`: js.UndefOr[Double] = js.undefined
  var `full-color`: js.UndefOr[Double] = js.undefined
  var `full-color-two-sided`: js.UndefOr[Double] = js.undefined
  var `highlight-color`: js.UndefOr[Double] = js.undefined
  var `highlight-color-two-sided`: js.UndefOr[Double] = js.undefined
  var monochrome: js.UndefOr[Double] = js.undefined
  var `monochrome-two-sided`: js.UndefOr[Double] = js.undefined
}

object Impressions {
  @scala.inline
  def apply(
    blank: js.UndefOr[Double] = js.undefined,
    `blank-two-sided`: js.UndefOr[Double] = js.undefined,
    `full-color`: js.UndefOr[Double] = js.undefined,
    `full-color-two-sided`: js.UndefOr[Double] = js.undefined,
    `highlight-color`: js.UndefOr[Double] = js.undefined,
    `highlight-color-two-sided`: js.UndefOr[Double] = js.undefined,
    monochrome: js.UndefOr[Double] = js.undefined,
    `monochrome-two-sided`: js.UndefOr[Double] = js.undefined
  ): Impressions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blank)) __obj.updateDynamic("blank")(blank.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`blank-two-sided`)) __obj.updateDynamic("blank-two-sided")(`blank-two-sided`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`full-color`)) __obj.updateDynamic("full-color")(`full-color`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`full-color-two-sided`)) __obj.updateDynamic("full-color-two-sided")(`full-color-two-sided`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`highlight-color`)) __obj.updateDynamic("highlight-color")(`highlight-color`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`highlight-color-two-sided`)) __obj.updateDynamic("highlight-color-two-sided")(`highlight-color-two-sided`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monochrome)) __obj.updateDynamic("monochrome")(monochrome.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`monochrome-two-sided`)) __obj.updateDynamic("monochrome-two-sided")(`monochrome-two-sided`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impressions]
  }
}

