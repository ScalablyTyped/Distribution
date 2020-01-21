package typings.libsodiumWrappers

import typings.libsodiumWrappers.mod.StateAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaderState extends js.Object {
  var header: String
  var state: StateAddress
}

object AnonHeaderState {
  @scala.inline
  def apply(header: String, state: StateAddress): AnonHeaderState = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeaderState]
  }
}

