package typings.knex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Max extends js.Object {
  var max: Double
  var min: Double
  var propagateCreateError: Boolean
}

object Max {
  @scala.inline
  def apply(max: Double, min: Double, propagateCreateError: Boolean): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], propagateCreateError = propagateCreateError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
}

