package typings.looksSame.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait First extends js.Object {
  var first: js.Any
  var second: js.Any
}

object First {
  @scala.inline
  def apply(first: js.Any, second: js.Any): First = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[First]
  }
}

