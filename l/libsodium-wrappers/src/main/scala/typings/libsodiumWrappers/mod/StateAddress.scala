package typings.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateAddress extends js.Object {
  var name: String
}

object StateAddress {
  @scala.inline
  def apply(name: String): StateAddress = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StateAddress]
  }
}

