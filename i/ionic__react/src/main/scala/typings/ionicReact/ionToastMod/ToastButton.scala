package typings.ionicReact.ionToastMod

import typings.ionicReact.AnonIos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @ionic/core.@ionic/core/dist/types/components/toast/toast-interface.ToastButton, 'icon'> ]: @ionic/core.@ionic/core/dist/types/components/toast/toast-interface.ToastButton[P]} */ trait ToastButton extends js.Object {
  var icon: js.UndefOr[AnonIos] = js.undefined
}

object ToastButton {
  @scala.inline
  def apply(icon: AnonIos = null): ToastButton = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastButton]
  }
}

