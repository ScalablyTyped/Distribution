package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA7[R, T, U, V, W, X, Y, Z] extends js.Object {
  def execute(t: T, u: U, v: V, w: W, x: X, y: Y, z: Z): js.Thenable[R]
}

object CommandA7 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y, Z](execute: js.Function7[T, U, V, W, X, Y, Z, js.Thenable[R]]): CommandA7[R, T, U, V, W, X, Y, Z] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.asInstanceOf[CommandA7[R, T, U, V, W, X, Y, Z]]
  }
}

