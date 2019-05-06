package typings
package atIonicCoreLib.distTypesComponentsActionDashSheetActionDashSheetDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetButton extends js.Object {
  var cssClass: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var handler: js.UndefOr[js.Function0[scala.Boolean | scala.Unit | js.Promise[scala.Boolean]]] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.cancel | atIonicCoreLib.atIonicCoreLibStrings.destructive | atIonicCoreLib.atIonicCoreLibStrings.selected | java.lang.String
  ] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ActionSheetButton {
  @scala.inline
  def apply(
    cssClass: java.lang.String | js.Array[java.lang.String] = null,
    handler: () => scala.Boolean | scala.Unit | js.Promise[scala.Boolean] = null,
    icon: java.lang.String = null,
    role: atIonicCoreLib.atIonicCoreLibStrings.cancel | atIonicCoreLib.atIonicCoreLibStrings.destructive | atIonicCoreLib.atIonicCoreLibStrings.selected | java.lang.String = null,
    text: java.lang.String = null
  ): ActionSheetButton = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction0(handler))
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ActionSheetButton]
  }
}

