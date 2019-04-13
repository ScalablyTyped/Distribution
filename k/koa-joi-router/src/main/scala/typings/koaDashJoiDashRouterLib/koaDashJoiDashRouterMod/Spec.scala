package typings
package koaDashJoiDashRouterLib.koaDashJoiDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  var handler: Handler
  var meta: js.UndefOr[js.Any] = js.undefined
  var method: java.lang.String | js.Array[java.lang.String]
  var path: java.lang.String | stdLib.RegExp
  var pre: js.UndefOr[Handler] = js.undefined
  var validate: js.UndefOr[koaDashJoiDashRouterLib.Anon_Body] = js.undefined
}

object Spec {
  @scala.inline
  def apply(
    handler: Handler,
    method: java.lang.String | js.Array[java.lang.String],
    path: java.lang.String | stdLib.RegExp,
    meta: js.Any = null,
    pre: Handler = null,
    validate: koaDashJoiDashRouterLib.Anon_Body = null
  ): Spec = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (pre != null) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[Spec]
  }
}

