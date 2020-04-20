package typings.looksSame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTolerance extends js.Object {
  var tolerance: Double
}

object AnonTolerance {
  @scala.inline
  def apply(tolerance: Double): AnonTolerance = {
    val __obj = js.Dynamic.literal(tolerance = tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTolerance]
  }
}

