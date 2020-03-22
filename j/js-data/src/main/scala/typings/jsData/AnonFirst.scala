package typings.jsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirst extends js.Object {
  var first: js.Any
  var keep: js.Any
}

object AnonFirst {
  @scala.inline
  def apply(first: js.Any, keep: js.Any): AnonFirst = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], keep = keep.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFirst]
  }
}

