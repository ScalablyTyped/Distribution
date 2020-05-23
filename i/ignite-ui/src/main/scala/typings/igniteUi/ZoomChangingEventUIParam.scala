package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomChangingEventUIParam extends js.Object {
  /**
    * Gets reference to igZoombar.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ZoomChangingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): ZoomChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomChangingEventUIParam]
  }
}

