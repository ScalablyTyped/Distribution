package typings
package lodashLib.lodashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancelable extends js.Object {
  def cancel(): scala.Unit
  def flush(): scala.Unit
}

object Cancelable {
  @scala.inline
  def apply(cancel: () => scala.Unit, flush: () => scala.Unit): Cancelable = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush))
  
    __obj.asInstanceOf[Cancelable]
  }
}

