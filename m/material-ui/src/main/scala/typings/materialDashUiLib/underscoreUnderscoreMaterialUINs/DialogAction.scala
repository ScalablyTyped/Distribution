package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogAction extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[js.Object]] = js.undefined
  var ref: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
}

object DialogAction {
  @scala.inline
  def apply(
    text: java.lang.String,
    id: java.lang.String = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    ref: java.lang.String = null
  ): DialogAction = {
    val __obj = js.Dynamic.literal(text = text)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[DialogAction]
  }
}

