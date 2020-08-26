package typings.koa.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State[StateT] extends js.Object {
  var state: StateT = js.native
}

object State {
  @scala.inline
  def apply[StateT](state: StateT): State[StateT] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[StateT]]
  }
  @scala.inline
  implicit class StateOps[Self <: State[_], StateT] (val x: Self with State[StateT]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setState(value: StateT): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

