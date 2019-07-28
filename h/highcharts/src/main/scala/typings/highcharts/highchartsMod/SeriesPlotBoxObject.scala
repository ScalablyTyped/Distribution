package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPlotBoxObject extends js.Object {
  var scaleX: Double
  var scaleY: Double
  var translateX: Double
  var translateY: Double
}

object SeriesPlotBoxObject {
  @scala.inline
  def apply(scaleX: Double, scaleY: Double, translateX: Double, translateY: Double): SeriesPlotBoxObject = {
    val __obj = js.Dynamic.literal(scaleX = scaleX, scaleY = scaleY, translateX = translateX, translateY = translateY)
  
    __obj.asInstanceOf[SeriesPlotBoxObject]
  }
}

