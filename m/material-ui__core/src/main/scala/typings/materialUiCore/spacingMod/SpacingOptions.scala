package typings.materialUiCore.spacingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/spacing.Spacing> */
@js.native
trait SpacingOptions extends js.Object {
  var unit: js.UndefOr[Double] = js.native
}

object SpacingOptions {
  @scala.inline
  def apply(unit: js.UndefOr[Double] = js.undefined): SpacingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(unit)) __obj.updateDynamic("unit")(unit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacingOptions]
  }
}

