package typings
package listrLib.listrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListrError[Ctx]
  extends stdLib.Error {
  var context: Ctx
}

object ListrError {
  @scala.inline
  def apply[Ctx](context: Ctx, message: java.lang.String, name: java.lang.String, stack: java.lang.String = null): ListrError[Ctx] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ListrError[Ctx]]
  }
}

