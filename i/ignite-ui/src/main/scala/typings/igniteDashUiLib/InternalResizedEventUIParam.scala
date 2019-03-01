package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalResizedEventUIParam extends js.Object {
  /**
  	 * Used to get a reference to the layout manager performing resizing.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object InternalResizedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): InternalResizedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[InternalResizedEventUIParam]
  }
}

