package typings.gyronorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbsolute extends js.Object {
  var absolute: Double
  var alpha: Double
  var beta: Double
  var gamma: Double
}

object AnonAbsolute {
  @scala.inline
  def apply(absolute: Double, alpha: Double, beta: Double, gamma: Double): AnonAbsolute = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbsolute]
  }
}

