package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOKClickEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the igGridModalDialog element.
  	 */
  var modalDialog: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the reference to the igGridModalDialog widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ButtonOKClickEventUIParam {
  @scala.inline
  def apply(modalDialog: String = null, owner: js.Any = null): ButtonOKClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (modalDialog != null) __obj.updateDynamic("modalDialog")(modalDialog)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ButtonOKClickEventUIParam]
  }
}

