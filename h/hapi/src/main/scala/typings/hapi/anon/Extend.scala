package typings.hapi.anon

import typings.hapi.hapiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend extends js.Object {
  @JSName("apply")
  var apply: `true`
  var extend: `true`
}

object Extend {
  @scala.inline
  def apply(apply: `true`, extend: `true`): Extend = {
    val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any], extend = extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extend]
  }
}

