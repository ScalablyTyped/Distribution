package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA1[R, T] extends js.Object {
  def execute(t: T): js.Thenable[R]
}

object CommandA1 {
  @scala.inline
  def apply[R, T](execute: js.Function1[T, js.Thenable[R]]): CommandA1[R, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.asInstanceOf[CommandA1[R, T]]
  }
}

