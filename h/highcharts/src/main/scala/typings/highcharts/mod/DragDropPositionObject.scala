package typings.highcharts.mod

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
    prevdX: js.UndefOr[Double] = js.undefined,
    prevdY: js.UndefOr[Double] = js.undefined
  ): DragDropPositionObject = {
    val __obj = js.Dynamic.literal(chartX = chartX.asInstanceOf[js.Any], chartY = chartY.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    if (guideBox != null) __obj.updateDynamic("guideBox")(guideBox.asInstanceOf[js.Any])
    if (!js.isUndefined(prevdX)) __obj.updateDynamic("prevdX")(prevdX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prevdY)) __obj.updateDynamic("prevdY")(prevdY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDropPositionObject]
  }
}

