package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontMetricsObject extends js.Object {
  /**
    * The baseline relative to the top of the box.
    */
  var b: Double
  /**
    * The font size.
    */
  var f: Double
  /**
    * The line height.
    */
  var h: Double
}

object FontMetricsObject {
  @scala.inline
  def apply(b: Double, f: Double, h: Double): FontMetricsObject = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FontMetricsObject]
  }
}

