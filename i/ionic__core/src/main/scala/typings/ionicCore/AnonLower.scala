package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLower extends js.Object {
  var lower: Double
  var upper: Double
}

object AnonLower {
  @scala.inline
  def apply(lower: Double, upper: Double): AnonLower = {
    val __obj = js.Dynamic.literal(lower = lower.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLower]
  }
}

