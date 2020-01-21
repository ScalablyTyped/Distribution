package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA3[R, T, U, V] extends js.Object {
  def execute(t: T, u: U, v: V): js.Thenable[R]
}

object CommandA3 {
  @scala.inline
  def apply[R, T, U, V](execute: (T, U, V) => js.Thenable[R]): CommandA3[R, T, U, V] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction3(execute))
  
    __obj.asInstanceOf[CommandA3[R, T, U, V]]
  }
}

