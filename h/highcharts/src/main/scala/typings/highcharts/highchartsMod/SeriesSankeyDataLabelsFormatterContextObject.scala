package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesSankeyDataLabelsFormatterContextObject extends DataLabelsFormatterContextObject {
  /**
    * The node object. The node name, if defined, is available through
    * `this.point.name`.
    */
  @JSName("point")
  var point_SeriesSankeyDataLabelsFormatterContextObject: SankeyNodeObject
}

object SeriesSankeyDataLabelsFormatterContextObject {
  @scala.inline
  def apply(
    point: SankeyNodeObject,
    series: Series,
    x: Double,
    percentage: Int | Double = null,
    total: Int | Double = null,
    y: Int | Double = null
  ): SeriesSankeyDataLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(point = point, series = series, x = x)
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSankeyDataLabelsFormatterContextObject]
  }
}

