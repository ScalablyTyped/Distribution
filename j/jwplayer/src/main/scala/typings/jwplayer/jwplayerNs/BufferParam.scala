package typings.jwplayer.jwplayerNs

import typings.jwplayer.jwplayerStrings.complete
import typings.jwplayer.jwplayerStrings.error
import typings.jwplayer.jwplayerStrings.loading
import typings.jwplayer.jwplayerStrings.stalled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferParam extends js.Object {
  var newstate: String
  var oldstate: String
  var reason: loading | complete | stalled | error
}

object BufferParam {
  @scala.inline
  def apply(newstate: String, oldstate: String, reason: loading | complete | stalled | error): BufferParam = {
    val __obj = js.Dynamic.literal(newstate = newstate, oldstate = oldstate, reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BufferParam]
  }
}

