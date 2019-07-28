package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormSuccessEventUIParam extends js.Object {
  /**
  	 * Gets reference to the igValidator widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to the event target form.
  	 */
  var target: js.UndefOr[String] = js.undefined
}

object FormSuccessEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, target: String = null): FormSuccessEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[FormSuccessEventUIParam]
  }
}

