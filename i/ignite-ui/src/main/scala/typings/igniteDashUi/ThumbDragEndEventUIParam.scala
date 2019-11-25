package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbDragEndEventUIParam extends js.Object {
  /**
  	 * Gets which scrollbar thumb is being used - horizontal(true) or vertical(false).
  	 */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets a reference to the igScroll.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ThumbDragEndEventUIParam {
  @scala.inline
  def apply(horizontal: js.UndefOr[Boolean] = js.undefined, owner: js.Any = null): ThumbDragEndEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbDragEndEventUIParam]
  }
}

