package typings.hapiAddress.mod.domain.Tlds

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deny extends js.Object {
  val deny: Set[String]
}

object Deny {
  @scala.inline
  def apply(deny: Set[String]): Deny = {
    val __obj = js.Dynamic.literal(deny = deny.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Deny]
  }
}

