package typings.hystrixjs.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA4[R, T, U, V, W] extends js.Object {
  def execute(t: T, u: U, v: V, w: W): js.Thenable[R]
}

object CommandA4 {
  @scala.inline
  def apply[R, T, U, V, W](execute: (T, U, V, W) => js.Thenable[R]): CommandA4[R, T, U, V, W] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction4(execute))
  
    __obj.asInstanceOf[CommandA4[R, T, U, V, W]]
  }
}

