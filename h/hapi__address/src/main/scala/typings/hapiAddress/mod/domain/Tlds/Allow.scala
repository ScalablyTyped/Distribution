package typings.hapiAddress.mod.domain.Tlds

import typings.hapiAddress.hapiAddressBooleans.`true`
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Allow extends js.Object {
  val allow: Set[String] | `true`
}

object Allow {
  @scala.inline
  def apply(allow: Set[String] | `true`): Allow = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Allow]
  }
}

