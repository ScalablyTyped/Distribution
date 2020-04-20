package typings.markdownDraftJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpen extends js.Object {
  def close(): String
  def open(): String
}

object AnonOpen {
  @scala.inline
  def apply(close: () => String, open: () => String): AnonOpen = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[AnonOpen]
  }
}

