package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var position: js.Tuple2[Double, Double]
  var user_id: Double | String
}

object Position {
  @scala.inline
  def apply(position: js.Tuple2[Double, Double], user_id: Double | String): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

