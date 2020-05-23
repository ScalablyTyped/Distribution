package typings.luminoPolling.anon

import typings.luminoPolling.mod.IPoll.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel[T, U, V /* <: String */] extends js.Object {
  def cancel(last: State[T, U, V]): Boolean
}

object Cancel {
  @scala.inline
  def apply[T, U, V](cancel: State[T, U, V] => Boolean): Cancel[T, U, V] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel))
    __obj.asInstanceOf[Cancel[T, U, V]]
  }
}

