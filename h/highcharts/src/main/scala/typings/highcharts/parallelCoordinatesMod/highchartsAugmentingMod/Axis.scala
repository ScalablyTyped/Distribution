package typings.highcharts.parallelCoordinatesMod.highchartsAugmentingMod

import typings.highcharts.mod.AxisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axis extends js.Object {
  /**
    * Set predefined left+width and top+height (inverted) for yAxes. This
    * method modifies options param.
    *
    * @param axisPosition
    *        ['left', 'width', 'height', 'top'] or ['top', 'height',
    *        'width', 'left'] for an inverted chart.
    *
    * @param options
    *        Highcharts.Axis#options.
    */
  def setParallelPosition(axisPosition: js.Array[String], options: AxisOptions): Unit
}

object Axis {
  @scala.inline
  def apply(setParallelPosition: (js.Array[String], AxisOptions) => Unit): Axis = {
    val __obj = js.Dynamic.literal(setParallelPosition = js.Any.fromFunction2(setParallelPosition))
  
    __obj.asInstanceOf[Axis]
  }
}

