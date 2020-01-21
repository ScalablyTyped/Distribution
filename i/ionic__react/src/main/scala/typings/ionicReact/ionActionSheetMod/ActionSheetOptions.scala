package typings.ionicReact.ionActionSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @ionic/core.@ionic/core/dist/types/components/action-sheet/action-sheet-interface.ActionSheetOptions, 'buttons'> ]: @ionic/core.@ionic/core/dist/types/components/action-sheet/action-sheet-interface.ActionSheetOptions[P]} */ trait ActionSheetOptions extends js.Object {
  var buttons: js.UndefOr[js.Array[ActionSheetButton | String]] = js.undefined
}

object ActionSheetOptions {
  @scala.inline
  def apply(buttons: js.Array[ActionSheetButton | String] = null): ActionSheetOptions = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetOptions]
  }
}

