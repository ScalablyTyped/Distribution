package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivatedEventUIParam extends js.Object {
  /**
  	 * Used to get reference to this igToolbarButton.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ActivatedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): ActivatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ActivatedEventUIParam]
  }
}

