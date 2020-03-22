package typings.materialDrawer.focusTrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@material/drawer.@material/drawer/focus-trap.Options, 'onActivate'> */
trait ActivateOptions extends js.Object {
  var onActivate: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ActivateOptions {
  @scala.inline
  def apply(onActivate: () => Unit = null): ActivateOptions = {
    val __obj = js.Dynamic.literal()
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction0(onActivate))
    __obj.asInstanceOf[ActivateOptions]
  }
}

