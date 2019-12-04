package typings.highcharts.modulesGanttMod.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointOptionsObject extends js.Object {
  /**
    * The ending X value of the range point.
    */
  var x2: js.UndefOr[Double] = js.undefined
}

object PointOptionsObject {
  @scala.inline
  def apply(x2: Int | Double = null): PointOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointOptionsObject]
  }
}

