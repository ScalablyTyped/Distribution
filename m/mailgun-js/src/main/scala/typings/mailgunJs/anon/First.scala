package typings.mailgunJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait First extends js.Object {
  var first: String
  var id: Double
}

object First {
  @scala.inline
  def apply(first: String, id: Double): First = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[First]
  }
}

