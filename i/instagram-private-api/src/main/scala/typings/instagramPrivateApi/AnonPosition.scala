package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var position: js.Tuple2[Double, Double]
  var user_id: Double | String
}

object AnonPosition {
  @scala.inline
  def apply(position: js.Tuple2[Double, Double], user_id: Double | String): AnonPosition = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPosition]
  }
}

