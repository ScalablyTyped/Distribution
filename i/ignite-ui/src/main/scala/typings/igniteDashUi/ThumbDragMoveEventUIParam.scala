package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbDragMoveEventUIParam extends js.Object {
  /**
  	 * Gets which scrollbar thumb is being used - horizontal(true) or vertical(false).
  	 */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets a reference to the igScroll.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets how much the content will be scrolled horizontally.
  	 */
  var stepX: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets how much the content will be scrolled vertically.
  	 */
  var stepY: js.UndefOr[Double] = js.undefined
}

object ThumbDragMoveEventUIParam {
  @scala.inline
  def apply(
    horizontal: js.UndefOr[Boolean] = js.undefined,
    owner: js.Any = null,
    stepX: Int | Double = null,
    stepY: Int | Double = null
  ): ThumbDragMoveEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (stepX != null) __obj.updateDynamic("stepX")(stepX.asInstanceOf[js.Any])
    if (stepY != null) __obj.updateDynamic("stepY")(stepY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbDragMoveEventUIParam]
  }
}

