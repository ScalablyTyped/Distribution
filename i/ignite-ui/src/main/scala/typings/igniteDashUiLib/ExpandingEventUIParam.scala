package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandingEventUIParam extends js.Object {
  /**
  	 * Used to get a reference the igSplitButton.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ExpandingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): ExpandingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ExpandingEventUIParam]
  }
}

