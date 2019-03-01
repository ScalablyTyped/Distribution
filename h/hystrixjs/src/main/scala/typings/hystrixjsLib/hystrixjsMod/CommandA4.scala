package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA4[R, T, U, V, W] extends js.Object {
  def execute(t: T, u: U, v: V, w: W): js.Thenable[R]
}

object CommandA4 {
  @scala.inline
  def apply[R, T, U, V, W](execute: js.Function4[T, U, V, W, js.Thenable[R]]): CommandA4[R, T, U, V, W] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.asInstanceOf[CommandA4[R, T, U, V, W]]
  }
}

