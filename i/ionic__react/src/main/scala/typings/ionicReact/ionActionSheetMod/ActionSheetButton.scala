package typings.ionicReact.ionActionSheetMod

import typings.ionicReact.AnonIos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @ionic/core.@ionic/core/dist/types/components/action-sheet/action-sheet-interface.ActionSheetButton, 'icon'> ]: @ionic/core.@ionic/core/dist/types/components/action-sheet/action-sheet-interface.ActionSheetButton[P]} */ trait ActionSheetButton extends js.Object {
  var icon: js.UndefOr[AnonIos] = js.undefined
}

object ActionSheetButton {
  @scala.inline
  def apply(icon: AnonIos = null): ActionSheetButton = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetButton]
  }
}

