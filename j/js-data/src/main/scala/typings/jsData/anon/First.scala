package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait First extends js.Object {
  var first: js.Any
  var keep: js.Any
}

object First {
  @scala.inline
  def apply(first: js.Any, keep: js.Any): First = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], keep = keep.asInstanceOf[js.Any])
    __obj.asInstanceOf[First]
  }
}

