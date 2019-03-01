package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonCancelClickEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the igGridModalDialog element.
  	 */
  var modalDialog: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the reference to the igGridModalDialog widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ButtonCancelClickEventUIParam {
  @scala.inline
  def apply(modalDialog: java.lang.String = null, owner: js.Any = null): ButtonCancelClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (modalDialog != null) __obj.updateDynamic("modalDialog")(modalDialog)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ButtonCancelClickEventUIParam]
  }
}

