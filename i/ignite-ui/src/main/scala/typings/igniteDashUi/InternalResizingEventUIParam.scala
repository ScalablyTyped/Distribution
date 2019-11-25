package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalResizingEventUIParam extends js.Object {
  /**
  	 * Used to get a reference to the layout manager performing resizing.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object InternalResizingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): InternalResizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalResizingEventUIParam]
  }
}

