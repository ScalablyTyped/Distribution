package typings.hapiHapi.anon

import typings.hapiHapi.mod.ServerAuthConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  var default: ServerAuthConfig
}

object Default {
  @scala.inline
  def apply(default: ServerAuthConfig): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
}

