package typings.gyronorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alpha extends js.Object {
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

object Anon_Alpha {
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
  ): Anon_Alpha = {
    val __obj = js.Dynamic.literal(alpha = alpha, beta = beta, gamma = gamma, gx = gx, gy = gy, gz = gz, x = x, y = y, z = z)
  
    __obj.asInstanceOf[Anon_Alpha]
  }
}

