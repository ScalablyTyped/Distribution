package typings.koa.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[StateT] extends js.Object {
  var state: StateT
}

object State {
  @scala.inline
  def apply[StateT](state: StateT): State[StateT] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[StateT]]
  }
}

