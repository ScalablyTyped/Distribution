package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollingEventUIParam extends js.Object {
  /**
  	 * Gets if the content is scrolled by the scrollbar track areas. 0 - none used, -1 - Scrolled Up/Left, 1 - Scrolled Down/Right.
  	 */
  var bigIncrement: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets which axis is being used to scroll - horizontal(true) or vertical(false).
  	 */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets a reference to the igScroll.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets if the content is scrolled by the arrows. 0 - none used, -1 - Arrow Up/Left, 1 - Arrow Down/Right.
  	 */
  var smallIncrement: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets how much the content will be scrolled horizontally.
  	 */
  var stepX: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets how much the content will be scrolled vertically.
  	 */
  var stepY: js.UndefOr[scala.Double] = js.undefined
}

object ScrollingEventUIParam {
  @scala.inline
  def apply(
    bigIncrement: scala.Int | scala.Double = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    owner: js.Any = null,
    smallIncrement: scala.Int | scala.Double = null,
    stepX: scala.Int | scala.Double = null,
    stepY: scala.Int | scala.Double = null
  ): ScrollingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (bigIncrement != null) __obj.updateDynamic("bigIncrement")(bigIncrement.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (smallIncrement != null) __obj.updateDynamic("smallIncrement")(smallIncrement.asInstanceOf[js.Any])
    if (stepX != null) __obj.updateDynamic("stepX")(stepX.asInstanceOf[js.Any])
    if (stepY != null) __obj.updateDynamic("stepY")(stepY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollingEventUIParam]
  }
}

