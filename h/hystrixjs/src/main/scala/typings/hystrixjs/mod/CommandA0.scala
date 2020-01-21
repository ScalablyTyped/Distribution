package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA0[R] extends js.Object {
  def execute[R](): js.Thenable[R]
}

object CommandA0 {
  @scala.inline
  def apply[R](execute: () => js.Thenable[js.Any]): CommandA0[R] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
  
    __obj.asInstanceOf[CommandA0[R]]
  }
}

