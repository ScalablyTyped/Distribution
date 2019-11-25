package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewChangedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the newly selected view.
  	 */
  var newSelectedView: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the scheduler.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ViewChangedEventUIParam {
  @scala.inline
  def apply(newSelectedView: String = null, owner: js.Any = null): ViewChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (newSelectedView != null) __obj.updateDynamic("newSelectedView")(newSelectedView.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewChangedEventUIParam]
  }
}

