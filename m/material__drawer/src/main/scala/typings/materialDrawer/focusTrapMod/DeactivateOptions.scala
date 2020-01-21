package typings.materialDrawer.focusTrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'onDeactivate' ]: @material/drawer.@material/drawer/focus-trap.Options[P]} */ trait DeactivateOptions extends js.Object {
  var returnFocus: js.UndefOr[Boolean] = js.undefined
}

object DeactivateOptions {
  @scala.inline
  def apply(returnFocus: js.UndefOr[Boolean] = js.undefined): DeactivateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(returnFocus)) __obj.updateDynamic("returnFocus")(returnFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivateOptions]
  }
}

