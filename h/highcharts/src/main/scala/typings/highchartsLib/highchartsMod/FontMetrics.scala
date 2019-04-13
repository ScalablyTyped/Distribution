package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontMetrics extends js.Object {
  /**
    * The baseline relative to the top of the box.
    */
  var b: scala.Double
  /**
    * The font size.
    */
  var f: scala.Double
  /**
    * The line height.
    */
  var h: scala.Double
}

object FontMetrics {
  @scala.inline
  def apply(b: scala.Double, f: scala.Double, h: scala.Double): FontMetrics = {
    val __obj = js.Dynamic.literal(b = b, f = f, h = h)
  
    __obj.asInstanceOf[FontMetrics]
  }
}

