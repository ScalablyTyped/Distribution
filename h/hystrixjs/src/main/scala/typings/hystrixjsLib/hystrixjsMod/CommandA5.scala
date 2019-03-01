package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA5[R, T, U, V, W, X] extends js.Object {
  def execute(t: T, u: U, v: V, w: W, x: X): js.Thenable[R]
}

object CommandA5 {
  @scala.inline
  def apply[R, T, U, V, W, X](execute: js.Function5[T, U, V, W, X, js.Thenable[R]]): CommandA5[R, T, U, V, W, X] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.asInstanceOf[CommandA5[R, T, U, V, W, X]]
  }
}

