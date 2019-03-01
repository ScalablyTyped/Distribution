package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorMessageDisplayingEventUIParam extends js.Object {
  /**
  	 * Used to get or set the error message that is to be shown.
  	 */
  var errorMessage: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain reference to the barcode widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ErrorMessageDisplayingEventUIParam {
  @scala.inline
  def apply(errorMessage: js.Any = null, owner: js.Any = null): ErrorMessageDisplayingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ErrorMessageDisplayingEventUIParam]
  }
}

