package typings.markdownIt.stateInlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scanned extends js.Object {
  var can_close: Boolean
  var can_open: Boolean
  var length: Double
}

object Scanned {
  @scala.inline
  def apply(can_close: Boolean, can_open: Boolean, length: Double): Scanned = {
    val __obj = js.Dynamic.literal(can_close = can_close.asInstanceOf[js.Any], can_open = can_open.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scanned]
  }
}

