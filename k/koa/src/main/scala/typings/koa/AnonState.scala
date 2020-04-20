package typings.koa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonState[StateT] extends js.Object {
  var state: StateT
}

object AnonState {
  @scala.inline
  def apply[StateT](state: StateT): AnonState[StateT] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonState[StateT]]
  }
}

