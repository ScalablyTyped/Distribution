package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragDropPositionObject extends js.Object {
  /**
    * Chart x position
    */
  var chartX: Double
  /**
    * Chart y position
    */
  var chartY: Double
  /**
    * Drag and drop guide box.
    */
  var guideBox: js.UndefOr[BBoxObject] = js.undefined
  /**
    * Updated point data.
    */
  var points: Dictionary[Dictionary[Double]]
  /**
    * Delta of previous x position.
    */
  var prevdX: js.UndefOr[Double] = js.undefined
  /**
    * Delta of previous y position.
    */
  var prevdY: js.UndefOr[Double] = js.undefined
}

object DragDropPositionObject {
  @scala.inline
  def apply(
    chartX: Double,
    chartY: Double,
    points: Dictionary[Dictionary[Double]],
    guideBox: BBoxObject = null,
    prevdX: Int | Double = null,
    prevdY: Int | Double = null
  ): DragDropPositionObject = {
    val __obj = js.Dynamic.literal(chartX = chartX, chartY = chartY, points = points)
    if (guideBox != null) __obj.updateDynamic("guideBox")(guideBox)
    if (prevdX != null) __obj.updateDynamic("prevdX")(prevdX.asInstanceOf[js.Any])
    if (prevdY != null) __obj.updateDynamic("prevdY")(prevdY.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDropPositionObject]
  }
}

