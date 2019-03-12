package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA6[R, T, U, V, W, X, Y] extends js.Object {
  def execute(t: T, u: U, v: V, w: W, x: X, y: Y): js.Thenable[R]
}

object CommandA6 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y](execute: (T, U, V, W, X, Y) => js.Thenable[R]): CommandA6[R, T, U, V, W, X, Y] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction6(execute))
  
    __obj.asInstanceOf[CommandA6[R, T, U, V, W, X, Y]]
  }
}

