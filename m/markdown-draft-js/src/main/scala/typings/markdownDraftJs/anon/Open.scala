package typings.markdownDraftJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Open extends js.Object {
  def close(): String
  def open(): String
}

object Open {
  @scala.inline
  def apply(close: () => String, open: () => String): Open = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Open]
  }
}

