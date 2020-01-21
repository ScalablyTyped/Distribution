package typings.highcharts.solidGaugeMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolOptionsObject extends js.Object {
  /**
    * Whether to draw rounded edges.
    */
  var rounded: js.UndefOr[Boolean] = js.undefined
}

object SymbolOptionsObject {
  @scala.inline
  def apply(rounded: js.UndefOr[Boolean] = js.undefined): SymbolOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolOptionsObject]
  }
}

