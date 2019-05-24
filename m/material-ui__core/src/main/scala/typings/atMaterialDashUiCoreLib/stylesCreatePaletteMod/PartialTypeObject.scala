package typings
package atMaterialDashUiCoreLib.stylesCreatePaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in keyof @material-ui/core.@material-ui/core/styles/createPalette.TypeObject ]:? std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeObject[P]>} */
trait PartialTypeObject extends js.Object {
  var action: js.UndefOr[atMaterialDashUiCoreLib.PartialTypeAction] = js.undefined
  var background: js.UndefOr[atMaterialDashUiCoreLib.PartialTypeBackground] = js.undefined
  var divider: js.UndefOr[stdLib.Partial[TypeDivider]] = js.undefined
  var text: js.UndefOr[atMaterialDashUiCoreLib.PartialTypeText] = js.undefined
}

object PartialTypeObject {
  @scala.inline
  def apply(
    action: atMaterialDashUiCoreLib.PartialTypeAction = null,
    background: atMaterialDashUiCoreLib.PartialTypeBackground = null,
    divider: stdLib.Partial[TypeDivider] = null,
    text: atMaterialDashUiCoreLib.PartialTypeText = null
  ): PartialTypeObject = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (background != null) __obj.updateDynamic("background")(background)
    if (divider != null) __obj.updateDynamic("divider")(divider)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[PartialTypeObject]
  }
}

