package typings.ltijs.mod.expressAugmentingMod

import typings.ltijs.anon.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var locals: Context
}

object Response {
  @scala.inline
  def apply(locals: Context): Response = {
    val __obj = js.Dynamic.literal(locals = locals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

