package typings.luminoPolling

import typings.luminoPolling.mod.IPoll.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel[T, U, V /* <: String */] extends js.Object {
  def cancel(last: State[T, U, V]): Boolean
}

object AnonCancel {
  @scala.inline
  def apply[T, U, V /* <: String */](cancel: State[T, U, V] => Boolean): AnonCancel[T, U, V] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel))
  
    __obj.asInstanceOf[AnonCancel[T, U, V]]
  }
}

