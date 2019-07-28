package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlurEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the igDialog widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object BlurEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): BlurEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[BlurEventUIParam]
  }
}

