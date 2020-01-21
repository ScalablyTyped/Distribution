package typings.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancelable extends js.Object {
  def cancel(): Unit
  def flush(): Unit
}

object Cancelable {
  @scala.inline
  def apply(cancel: () => Unit, flush: () => Unit): Cancelable = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush))
  
    __obj.asInstanceOf[Cancelable]
  }
}

