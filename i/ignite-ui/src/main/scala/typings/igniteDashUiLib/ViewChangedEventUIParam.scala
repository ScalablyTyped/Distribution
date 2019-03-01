package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewChangedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the newly selected view.
  	 */
  var newSelectedView: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the scheduler.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ViewChangedEventUIParam {
  @scala.inline
  def apply(newSelectedView: java.lang.String = null, owner: js.Any = null): ViewChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (newSelectedView != null) __obj.updateDynamic("newSelectedView")(newSelectedView)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ViewChangedEventUIParam]
  }
}

