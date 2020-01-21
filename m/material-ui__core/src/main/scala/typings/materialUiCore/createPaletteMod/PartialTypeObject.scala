package typings.materialUiCore.createPaletteMod

import typings.materialUiCore.PartialTypeAction
import typings.materialUiCore.PartialTypeBackground
import typings.materialUiCore.PartialTypeText
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in keyof @material-ui/core.@material-ui/core/styles/createPalette.TypeObject ]:? std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeObject[P]>} */
@js.native
trait PartialTypeObject extends js.Object {
  var action: js.UndefOr[PartialTypeAction] = js.native
  var background: js.UndefOr[PartialTypeBackground] = js.native
  var divider: js.UndefOr[Partial[TypeDivider]] = js.native
  var text: js.UndefOr[PartialTypeText] = js.native
}

object PartialTypeObject {
  @scala.inline
  def apply(
    action: PartialTypeAction = null,
    background: PartialTypeBackground = null,
    divider: Partial[TypeDivider] = null,
    text: PartialTypeText = null
  ): PartialTypeObject = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (divider != null) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTypeObject]
  }
}

