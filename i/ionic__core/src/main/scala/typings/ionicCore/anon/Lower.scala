package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lower extends js.Object {
  var lower: Double
  var upper: Double
}

object Lower {
  @scala.inline
  def apply(lower: Double, upper: Double): Lower = {
    val __obj = js.Dynamic.literal(lower = lower.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lower]
  }
}

