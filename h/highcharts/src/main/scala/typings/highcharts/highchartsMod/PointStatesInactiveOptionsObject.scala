package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointStatesInactiveOptionsObject extends js.Object {
  /**
    * Opacity of inactive markers.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PointStatesInactiveOptionsObject {
  @scala.inline
  def apply(opacity: Int | Double = null): PointStatesInactiveOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointStatesInactiveOptionsObject]
  }
}

