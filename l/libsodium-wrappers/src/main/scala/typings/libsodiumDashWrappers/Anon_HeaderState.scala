package typings.libsodiumDashWrappers

import typings.libsodiumDashWrappers.libsodiumDashWrappersMod.StateAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeaderState extends js.Object {
  var header: String
  var state: StateAddress
}

object Anon_HeaderState {
  @scala.inline
  def apply(header: String, state: StateAddress): Anon_HeaderState = {
    val __obj = js.Dynamic.literal(header = header, state = state)
  
    __obj.asInstanceOf[Anon_HeaderState]
  }
}

