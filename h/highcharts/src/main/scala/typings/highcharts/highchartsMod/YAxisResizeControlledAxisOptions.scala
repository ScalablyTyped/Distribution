package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisResizeControlledAxisOptions extends js.Object {
  /**
    * (Highstock) Array of axes that should move out of the way of resizing
    * being done for the current axis. If not set, the next axis will be used.
    *
    * This feature requires the `drag-panes.js` module.
    */
  var next: js.UndefOr[js.Array[String | Double]] = js.undefined
  /**
    * (Highstock) Array of axes that should move with the current axis while
    * resizing.
    *
    * This feature requires the `drag-panes.js` module.
    */
  var prev: js.UndefOr[js.Array[String | Double]] = js.undefined
}

object YAxisResizeControlledAxisOptions {
  @scala.inline
  def apply(next: js.Array[String | Double] = null, prev: js.Array[String | Double] = null): YAxisResizeControlledAxisOptions = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[YAxisResizeControlledAxisOptions]
  }
}

