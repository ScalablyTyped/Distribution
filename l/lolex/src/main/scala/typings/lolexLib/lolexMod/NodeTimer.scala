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
  def apply(ref: js.Function0[scala.Unit], unref: js.Function0[scala.Unit]): NodeTimer = {
    val __obj = js.Dynamic.literal(ref = ref, unref = unref)
  
    __obj.asInstanceOf[NodeTimer]
  }
}

