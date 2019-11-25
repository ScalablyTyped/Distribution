package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BubbleLegendFormatterContextObject extends js.Object {
  /**
    * The center y position of the range.
    */
  var center: Double
  /**
    * The radius of the bubble range.
    */
  var radius: Double
  /**
    * The bubble value.
    */
  var value: Double
}

object BubbleLegendFormatterContextObject {
  @scala.inline
  def apply(center: Double, radius: Double, value: Double): BubbleLegendFormatterContextObject = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BubbleLegendFormatterContextObject]
  }
}

