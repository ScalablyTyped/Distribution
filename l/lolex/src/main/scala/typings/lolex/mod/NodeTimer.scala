package typings.lolex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeTimer extends js.Object {
  /**
    * Stub method call. Does nothing.
    */
  def ref(): Unit
  /**
    * Stub method call. Does nothing.
    */
  def unref(): Unit
}

object NodeTimer {
  @scala.inline
  def apply(ref: () => Unit, unref: () => Unit): NodeTimer = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
  
    __obj.asInstanceOf[NodeTimer]
  }
}

