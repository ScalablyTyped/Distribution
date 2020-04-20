package typings.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlushOnEnd extends js.Object {
  var flushOnEnd: Boolean
}

object AnonFlushOnEnd {
  @scala.inline
  def apply(flushOnEnd: Boolean): AnonFlushOnEnd = {
    val __obj = js.Dynamic.literal(flushOnEnd = flushOnEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlushOnEnd]
  }
}

