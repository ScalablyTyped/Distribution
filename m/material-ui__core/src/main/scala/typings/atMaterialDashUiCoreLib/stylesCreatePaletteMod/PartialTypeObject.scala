package typings
package atMaterialDashUiCoreLib.stylesCreatePaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in keyof @material-ui/core.@material-ui/core/styles/createPalette.TypeObject ]:? std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeObject[P]>} */
trait PartialTypeObject extends js.Object {
  var action: js.UndefOr[stdLib.Partial[TypeAction]] = js.undefined
  var background: js.UndefOr[stdLib.Partial[TypeBackground]] = js.undefined
  var divider: js.UndefOr[stdLib.Partial[TypeDivider]] = js.undefined
  var text: js.UndefOr[stdLib.Partial[TypeText]] = js.undefined
}

object PartialTypeObject {
  @scala.inline
  def apply(
    action: stdLib.Partial[TypeAction] = null,
    background: stdLib.Partial[TypeBackground] = null,
    divider: stdLib.Partial[TypeDivider] = null,
    text: stdLib.Partial[TypeText] = null
  ): PartialTypeObject = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (background != null) __obj.updateDynamic("background")(background)
    if (divider != null) __obj.updateDynamic("divider")(divider)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[PartialTypeObject]
  }
}

