package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowRectChangedEventUIParam extends js.Object {
  /**
  	 * Used to get reference to chart object.
  	 */
  var chart: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get new height value.
  	 */
  var newHeight: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get new left value.
  	 */
  var newLeft: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get new top value.
  	 */
  var newTop: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get new top value.
  	 */
  var newWidth: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get old height value.
  	 */
  var oldHeight: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get old left value.
  	 */
  var oldLeft: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get old top value.
  	 */
  var oldTop: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get old top value.
  	 */
  var oldWidth: js.UndefOr[js.Any] = js.undefined
}

object WindowRectChangedEventUIParam {
  @scala.inline
  def apply(
    chart: js.Any = null,
    newHeight: js.Any = null,
    newLeft: js.Any = null,
    newTop: js.Any = null,
    newWidth: js.Any = null,
    oldHeight: js.Any = null,
    oldLeft: js.Any = null,
    oldTop: js.Any = null,
    oldWidth: js.Any = null
  ): WindowRectChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (newHeight != null) __obj.updateDynamic("newHeight")(newHeight.asInstanceOf[js.Any])
    if (newLeft != null) __obj.updateDynamic("newLeft")(newLeft.asInstanceOf[js.Any])
    if (newTop != null) __obj.updateDynamic("newTop")(newTop.asInstanceOf[js.Any])
    if (newWidth != null) __obj.updateDynamic("newWidth")(newWidth.asInstanceOf[js.Any])
    if (oldHeight != null) __obj.updateDynamic("oldHeight")(oldHeight.asInstanceOf[js.Any])
    if (oldLeft != null) __obj.updateDynamic("oldLeft")(oldLeft.asInstanceOf[js.Any])
    if (oldTop != null) __obj.updateDynamic("oldTop")(oldTop.asInstanceOf[js.Any])
    if (oldWidth != null) __obj.updateDynamic("oldWidth")(oldWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowRectChangedEventUIParam]
  }
}

