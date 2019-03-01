package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA0[R] extends js.Object {
  def execute[R](): js.Thenable[R]
}

object CommandA0 {
  @scala.inline
  def apply[R](execute: js.Function0[js.Thenable[js.Any]]): CommandA0[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.asInstanceOf[CommandA0[R]]
  }
}

