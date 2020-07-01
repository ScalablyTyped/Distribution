package typings.ionicCore.actionSheetInterfaceMod

import typings.ionicCore.ionicCoreStrings.cancel
import typings.ionicCore.ionicCoreStrings.destructive
import typings.ionicCore.ionicCoreStrings.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetButton extends js.Object {
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var handler: js.UndefOr[js.Function0[Boolean | Unit | (js.Promise[Boolean | Unit])]] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[cancel | destructive | selected | String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object ActionSheetButton {
  @scala.inline
  def apply(
    cssClass: String | js.Array[String] = null,
    handler: () => Boolean | Unit | (js.Promise[Boolean | Unit]) = null,
    icon: String = null,
    role: cancel | destructive | selected | String = null,
    text: String = null
  ): ActionSheetButton = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction0(handler))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetButton]
  }
}

