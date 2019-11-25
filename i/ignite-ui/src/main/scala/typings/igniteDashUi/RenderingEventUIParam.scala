package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the editor element.
  	 */
  var element: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the editor performing rendering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object RenderingEventUIParam {
  @scala.inline
  def apply(element: js.Any = null, owner: js.Any = null): RenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderingEventUIParam]
  }
}

