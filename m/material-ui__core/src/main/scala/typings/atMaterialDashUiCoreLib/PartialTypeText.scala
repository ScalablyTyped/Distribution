package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeText> */
trait PartialTypeText extends js.Object {
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  var hint: js.UndefOr[java.lang.String] = js.undefined
  var primary: js.UndefOr[java.lang.String] = js.undefined
  var secondary: js.UndefOr[java.lang.String] = js.undefined
}

object PartialTypeText {
  @scala.inline
  def apply(
    disabled: java.lang.String = null,
    hint: java.lang.String = null,
    primary: java.lang.String = null,
    secondary: java.lang.String = null
  ): PartialTypeText = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (primary != null) __obj.updateDynamic("primary")(primary)
    if (secondary != null) __obj.updateDynamic("secondary")(secondary)
    __obj.asInstanceOf[PartialTypeText]
  }
}

