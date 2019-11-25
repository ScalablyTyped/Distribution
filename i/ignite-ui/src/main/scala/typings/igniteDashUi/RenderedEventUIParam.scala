package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderedEventUIParam extends js.Object {
  /**
  	 * Used to get a reference to the main/top combo element.
  	 */
  var element: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get a reference to the combo performing rendering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object RenderedEventUIParam {
  @scala.inline
  def apply(element: js.Any = null, owner: js.Any = null): RenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedEventUIParam]
  }
}

