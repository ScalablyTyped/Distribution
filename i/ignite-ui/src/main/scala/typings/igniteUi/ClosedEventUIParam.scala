package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClosedEventUIParam extends js.Object {
  /**
    * Used to obtain reference to menu widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ClosedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): ClosedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosedEventUIParam]
  }
}

