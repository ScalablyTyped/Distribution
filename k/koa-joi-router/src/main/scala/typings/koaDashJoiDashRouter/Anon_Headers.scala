package typings.koaDashJoiDashRouter

import typings.joi.joiMod.SchemaLike
import typings.koaDashJoiDashRouter.koaDashJoiDashRouterMod.OutputValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends OutputValidation {
  var headers: SchemaLike
}

object Anon_Headers {
  @scala.inline
  def apply(headers: SchemaLike = null): Anon_Headers = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Headers]
  }
}

