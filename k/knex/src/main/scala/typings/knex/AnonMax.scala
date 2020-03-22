package typings.knex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  var max: Double
  var min: Double
  var propagateCreateError: Boolean
}

object AnonMax {
  @scala.inline
  def apply(max: Double, min: Double, propagateCreateError: Boolean): AnonMax = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], propagateCreateError = propagateCreateError.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMax]
  }
}

