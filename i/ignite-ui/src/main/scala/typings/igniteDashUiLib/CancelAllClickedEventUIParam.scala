package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelAllClickedEventUIParam extends js.Object {
  /**
  	 * Gets the igUpload widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object CancelAllClickedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): CancelAllClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[CancelAllClickedEventUIParam]
  }
}

