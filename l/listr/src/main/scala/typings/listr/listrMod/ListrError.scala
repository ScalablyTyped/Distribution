package typings.listr.listrMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListrError[Ctx] extends Error {
  var context: Ctx
}

object ListrError {
  @scala.inline
  def apply[Ctx](context: Ctx, message: String, name: String, stack: String = null): ListrError[Ctx] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ListrError[Ctx]]
  }
}

