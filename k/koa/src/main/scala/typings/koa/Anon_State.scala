package typings.koa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_State[StateT] extends js.Object {
  var state: StateT
}

object Anon_State {
  @scala.inline
  def apply[StateT](state: StateT): Anon_State[StateT] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_State[StateT]]
  }
}

