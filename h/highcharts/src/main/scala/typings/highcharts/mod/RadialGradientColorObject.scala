package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGradientColorObject extends js.Object {
  /**
    * Center horizontal position relative to the shape. Float ranges 0-1.
    */
  var cx: Double
  /**
    * Center vertical position relative to the shape. Float ranges 0-1.
    */
  var cy: Double
  /**
    * Radius relative to the shape. Float ranges 0-1.
    */
  var r: Double
}

object RadialGradientColorObject {
  @scala.inline
  def apply(cx: Double, cy: Double, r: Double): RadialGradientColorObject = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RadialGradientColorObject]
  }
}

