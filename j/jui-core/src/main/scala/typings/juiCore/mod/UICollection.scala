package typings.juiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UICollection extends js.Object {
  def destroy(): Unit
}

object UICollection {
  @scala.inline
  def apply(destroy: () => Unit): UICollection = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[UICollection]
  }
}

