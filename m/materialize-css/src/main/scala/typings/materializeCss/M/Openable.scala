package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Openable extends js.Object {
  var isOpen: Boolean
  def close(): Unit
  def open(): Unit
}

object Openable {
  @scala.inline
  def apply(close: () => Unit, isOpen: Boolean, open: () => Unit): Openable = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Openable]
  }
}

