package typings.kefir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlushOnEnd extends js.Object {
  var flushOnEnd: Boolean
}

object FlushOnEnd {
  @scala.inline
  def apply(flushOnEnd: Boolean): FlushOnEnd = {
    val __obj = js.Dynamic.literal(flushOnEnd = flushOnEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlushOnEnd]
  }
}

