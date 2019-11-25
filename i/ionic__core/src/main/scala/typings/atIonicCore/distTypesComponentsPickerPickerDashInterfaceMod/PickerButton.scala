package typings.atIonicCore.distTypesComponentsPickerPickerDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerButton extends js.Object {
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var handler: js.UndefOr[js.Function1[/* value */ js.Any, Boolean | Unit]] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object PickerButton {
  @scala.inline
  def apply(
    cssClass: String | js.Array[String] = null,
    handler: /* value */ js.Any => Boolean | Unit = null,
    role: String = null,
    text: String = null
  ): PickerButton = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction1(handler))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerButton]
  }
}

