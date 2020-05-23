package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Found extends js.Object {
  var found: Boolean
  var index: Double
}

object Found {
  @scala.inline
  def apply(found: Boolean, index: Double): Found = {
    val __obj = js.Dynamic.literal(found = found.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Found]
  }
}

