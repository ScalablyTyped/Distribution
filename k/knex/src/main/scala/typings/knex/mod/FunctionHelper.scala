package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionHelper extends js.Object {
  def now(): Raw[_]
}

object FunctionHelper {
  @scala.inline
  def apply(now: () => Raw[_]): FunctionHelper = {
    val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
  
    __obj.asInstanceOf[FunctionHelper]
  }
}

