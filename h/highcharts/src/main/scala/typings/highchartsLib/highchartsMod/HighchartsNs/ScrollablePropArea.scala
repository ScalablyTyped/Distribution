package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollablePropArea extends js.Object {
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var scrollPositionX: js.UndefOr[scala.Double] = js.undefined
}

object ScrollablePropArea {
  @scala.inline
  def apply(minWidth: scala.Int | scala.Double = null, scrollPositionX: scala.Int | scala.Double = null): ScrollablePropArea = {
    val __obj = js.Dynamic.literal()
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (scrollPositionX != null) __obj.updateDynamic("scrollPositionX")(scrollPositionX.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollablePropArea]
  }
}

