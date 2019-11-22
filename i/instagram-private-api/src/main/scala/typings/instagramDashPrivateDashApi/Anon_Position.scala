package typings.instagramDashPrivateDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Position extends js.Object {
  var position: js.Tuple2[Double, Double]
  var user_id: Double | String
}

object Anon_Position {
  @scala.inline
  def apply(position: js.Tuple2[Double, Double], user_id: Double | String): Anon_Position = {
    val __obj = js.Dynamic.literal(position = position, user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Position]
  }
}

