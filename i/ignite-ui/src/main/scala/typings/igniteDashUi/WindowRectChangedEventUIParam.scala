package typings.igniteDashUi

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
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (newHeight != null) __obj.updateDynamic("newHeight")(newHeight)
    if (newLeft != null) __obj.updateDynamic("newLeft")(newLeft)
    if (newTop != null) __obj.updateDynamic("newTop")(newTop)
    if (newWidth != null) __obj.updateDynamic("newWidth")(newWidth)
    if (oldHeight != null) __obj.updateDynamic("oldHeight")(oldHeight)
    if (oldLeft != null) __obj.updateDynamic("oldLeft")(oldLeft)
    if (oldTop != null) __obj.updateDynamic("oldTop")(oldTop)
    if (oldWidth != null) __obj.updateDynamic("oldWidth")(oldWidth)
    __obj.asInstanceOf[WindowRectChangedEventUIParam]
  }
}

