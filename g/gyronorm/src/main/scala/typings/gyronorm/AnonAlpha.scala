package typings.gyronorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlpha extends js.Object {
  var alpha: Double
  var beta: Double
  var gamma: Double
  var gx: Double
  var gy: Double
  var gz: Double
  var x: Double
  var y: Double
  var z: Double
}

object AnonAlpha {
  @scala.inline
  def apply(
    alpha: Double,
    beta: Double,
    gamma: Double,
    gx: Double,
    gy: Double,
    gz: Double,
    x: Double,
    y: Double,
    z: Double
  ): AnonAlpha = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any], gx = gx.asInstanceOf[js.Any], gy = gy.asInstanceOf[js.Any], gz = gz.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlpha]
  }
}

