package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbDragMoveEventUIParam extends js.Object {
  /**
  	 * Gets which scrollbar thumb is being used - horizontal(true) or vertical(false).
  	 */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets a reference to the igScroll.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets how much the content will be scrolled horizontally.
  	 */
  var stepX: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets how much the content will be scrolled vertically.
  	 */
  var stepY: js.UndefOr[scala.Double] = js.undefined
}

object ThumbDragMoveEventUIParam {
  @scala.inline
  def apply(
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    owner: js.Any = null,
    stepX: scala.Int | scala.Double = null,
    stepY: scala.Int | scala.Double = null
  ): ThumbDragMoveEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (stepX != null) __obj.updateDynamic("stepX")(stepX.asInstanceOf[js.Any])
    if (stepY != null) __obj.updateDynamic("stepY")(stepY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbDragMoveEventUIParam]
  }
}

