package typings
package atIonicCoreLib.distTypesComponentsPickerPickerDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerButton extends js.Object {
  var cssClass: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var handler: js.UndefOr[js.Function1[/* value */ js.Any, scala.Boolean | scala.Unit]] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object PickerButton {
  @scala.inline
  def apply(
    cssClass: java.lang.String | js.Array[java.lang.String] = null,
    handler: /* value */ js.Any => scala.Boolean | scala.Unit = null,
    role: java.lang.String = null,
    text: java.lang.String = null
  ): PickerButton = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction1(handler))
    if (role != null) __obj.updateDynamic("role")(role)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[PickerButton]
  }
}

