package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofxhttpRpc extends js.Object {
  def dispatch(): Double
}

object TypeofxhttpRpc {
  @scala.inline
  def apply(dispatch: () => Double): TypeofxhttpRpc = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction0(dispatch))
    __obj.asInstanceOf[TypeofxhttpRpc]
  }
}

