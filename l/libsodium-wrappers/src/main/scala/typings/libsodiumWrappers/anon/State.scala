package typings.libsodiumWrappers.anon

import typings.libsodiumWrappers.mod.StateAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var header: String
  var state: StateAddress
}

object State {
  @scala.inline
  def apply(header: String, state: StateAddress): State = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

