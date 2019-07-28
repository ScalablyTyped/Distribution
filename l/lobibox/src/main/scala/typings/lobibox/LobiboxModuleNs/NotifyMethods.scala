package typings.lobibox.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyMethods extends js.Object {
  var remove: js.UndefOr[js.Function0[_]] = js.undefined
}

object NotifyMethods {
  @scala.inline
  def apply(remove: () => _ = null): NotifyMethods = {
    val __obj = js.Dynamic.literal()
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction0(remove))
    __obj.asInstanceOf[NotifyMethods]
  }
}

