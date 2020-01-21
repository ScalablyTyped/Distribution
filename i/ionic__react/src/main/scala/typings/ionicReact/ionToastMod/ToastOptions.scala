package typings.ionicReact.ionToastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @ionic/core.@ionic/core/dist/types/components/toast/toast-interface.ToastOptions, 'buttons'> ]: @ionic/core.@ionic/core/dist/types/components/toast/toast-interface.ToastOptions[P]} */ trait ToastOptions extends js.Object {
  var buttons: js.UndefOr[js.Array[ToastButton | String]] = js.undefined
}

object ToastOptions {
  @scala.inline
  def apply(buttons: js.Array[ToastButton | String] = null): ToastOptions = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
}

