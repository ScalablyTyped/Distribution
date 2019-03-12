package typings
package lolexLib.lolexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeTimer extends js.Object {
  /**
    * Stub method call. Does nothing.
    */
  def ref(): scala.Unit
  /**
    * Stub method call. Does nothing.
    */
  def unref(): scala.Unit
}

object NodeTimer {
  @scala.inline
  def apply(ref: () => scala.Unit, unref: () => scala.Unit): NodeTimer = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
  
    __obj.asInstanceOf[NodeTimer]
  }
}

