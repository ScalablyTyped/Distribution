package typings.koaDashJoiDashRouter

import typings.joi.joiMod.SchemaLike
import typings.koaDashJoiDashRouter.koaDashJoiDashRouterMod.OutputValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends OutputValidation {
  var body: SchemaLike
}

object Anon_Body {
  @scala.inline
  def apply(body: SchemaLike = null): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Body]
  }
}

