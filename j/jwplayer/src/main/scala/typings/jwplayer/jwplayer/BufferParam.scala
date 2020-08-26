package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.complete
import typings.jwplayer.jwplayerStrings.error
import typings.jwplayer.jwplayerStrings.loading
import typings.jwplayer.jwplayerStrings.stalled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferParam extends js.Object {
  var newstate: String = js.native
  var oldstate: String = js.native
  var reason: loading | complete | stalled | error = js.native
}

object BufferParam {
  @scala.inline
  def apply(newstate: String, oldstate: String, reason: loading | complete | stalled | error): BufferParam = {
    val __obj = js.Dynamic.literal(newstate = newstate.asInstanceOf[js.Any], oldstate = oldstate.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferParam]
  }
  @scala.inline
  implicit class BufferParamOps[Self <: BufferParam] (val x: Self) extends AnyVal {
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
    def setNewstate(value: String): Self = this.set("newstate", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldstate(value: String): Self = this.set("oldstate", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: loading | complete | stalled | error): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

