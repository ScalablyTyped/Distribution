package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradientColorObject extends js.Object {
  /**
    * Start horizontal position of the gradient. Float ranges 0-1.
    */
  var x1: Double
  /**
    * End horizontal position of the gradient. Float ranges 0-1.
    */
  var x2: Double
  /**
    * Start vertical position of the gradient. Float ranges 0-1.
    */
  var y1: Double
  /**
    * End vertical position of the gradient. Float ranges 0-1.
    */
  var y2: Double
}

object LinearGradientColorObject {
  @scala.inline
  def apply(x1: Double, x2: Double, y1: Double, y2: Double): LinearGradientColorObject = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LinearGradientColorObject]
  }
}

