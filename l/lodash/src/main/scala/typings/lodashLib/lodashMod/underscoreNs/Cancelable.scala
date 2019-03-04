package typings
package lodashLib.lodashMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancelable extends js.Object {
  def cancel(): scala.Unit
  def flush(): scala.Unit
}

object Cancelable {
  @scala.inline
  def apply(cancel: js.Function0[scala.Unit], flush: js.Function0[scala.Unit]): Cancelable = {
    val __obj = js.Dynamic.literal(cancel = cancel, flush = flush)
  
    __obj.asInstanceOf[Cancelable]
  }
}

