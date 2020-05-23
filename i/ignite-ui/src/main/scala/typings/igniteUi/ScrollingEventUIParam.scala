package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollingEventUIParam extends js.Object {
  /**
    * Gets if the content is scrolled by the scrollbar track areas. 0 - none used, -1 - Scrolled Up/Left, 1 - Scrolled Down/Right.
    */
  var bigIncrement: js.UndefOr[Double] = js.undefined
  /**
    * Gets which axis is being used to scroll - horizontal(true) or vertical(false).
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets a reference to the igScroll.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets if the content is scrolled by the arrows. 0 - none used, -1 - Arrow Up/Left, 1 - Arrow Down/Right.
    */
  var smallIncrement: js.UndefOr[Double] = js.undefined
  /**
    * Gets how much the content will be scrolled horizontally.
    */
  var stepX: js.UndefOr[Double] = js.undefined
  /**
    * Gets how much the content will be scrolled vertically.
    */
  var stepY: js.UndefOr[Double] = js.undefined
}

object ScrollingEventUIParam {
  @scala.inline
  def apply(
    bigIncrement: js.UndefOr[Double] = js.undefined,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    owner: js.Any = null,
    smallIncrement: js.UndefOr[Double] = js.undefined,
    stepX: js.UndefOr[Double] = js.undefined,
    stepY: js.UndefOr[Double] = js.undefined
  ): ScrollingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bigIncrement)) __obj.updateDynamic("bigIncrement")(bigIncrement.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.get.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(smallIncrement)) __obj.updateDynamic("smallIncrement")(smallIncrement.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stepX)) __obj.updateDynamic("stepX")(stepX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stepY)) __obj.updateDynamic("stepY")(stepY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollingEventUIParam]
  }
}

