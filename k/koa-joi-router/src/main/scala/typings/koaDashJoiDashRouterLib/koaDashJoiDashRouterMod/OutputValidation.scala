package typings
package koaDashJoiDashRouterLib.koaDashJoiDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputValidation extends js.Object {
  var body: js.UndefOr[joiLib.joiMod.SchemaLike] = js.undefined
  var headers: js.UndefOr[joiLib.joiMod.SchemaLike] = js.undefined
}

object OutputValidation {
  @scala.inline
  def apply(body: joiLib.joiMod.SchemaLike = null, headers: joiLib.joiMod.SchemaLike = null): OutputValidation = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputValidation]
  }
}

