package typings
package laterLib.laterMod.laterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  /**
    * Clear the timer and end execution.
    */
  def clear(): scala.Unit
}

object Timer {
  @scala.inline
  def apply(clear: js.Function0[scala.Unit]): Timer = {
    val __obj = js.Dynamic.literal(clear = clear)
  
    __obj.asInstanceOf[Timer]
  }
}

