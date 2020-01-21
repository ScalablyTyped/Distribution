package typings.mailgunJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirst extends js.Object {
  var first: String
  var id: Double
}

object AnonFirst {
  @scala.inline
  def apply(first: String, id: Double): AnonFirst = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFirst]
  }
}

