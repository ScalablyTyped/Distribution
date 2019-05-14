package typings
package atMaterialDashUiCoreLib.stylesSpacingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/spacing.Spacing> */
trait SpacingOptions extends js.Object {
  var unit: js.UndefOr[scala.Double] = js.undefined
}

object SpacingOptions {
  @scala.inline
  def apply(unit: scala.Int | scala.Double = null): SpacingOptions = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacingOptions]
  }
}

