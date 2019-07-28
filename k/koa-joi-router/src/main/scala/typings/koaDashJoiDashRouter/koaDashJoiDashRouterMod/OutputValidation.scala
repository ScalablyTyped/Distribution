package typings.koaDashJoiDashRouter.koaDashJoiDashRouterMod

import typings.joi.joiMod.SchemaLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputValidation extends js.Object {
  var body: js.UndefOr[SchemaLike] = js.undefined
  var headers: js.UndefOr[SchemaLike] = js.undefined
}

object OutputValidation {
  @scala.inline
  def apply(body: SchemaLike = null, headers: SchemaLike = null): OutputValidation = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputValidation]
  }
}

