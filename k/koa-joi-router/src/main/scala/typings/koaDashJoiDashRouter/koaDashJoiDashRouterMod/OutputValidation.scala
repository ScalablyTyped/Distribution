package typings.koaDashJoiDashRouter.koaDashJoiDashRouterMod

import typings.joi.joiMod.SchemaLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.koaDashJoiDashRouter.Anon_Body
  - typings.koaDashJoiDashRouter.Anon_Headers
*/
trait OutputValidation extends js.Object

object OutputValidation {
  @scala.inline
  def Anon_Body(body: SchemaLike = null): OutputValidation = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputValidation]
  }
  @scala.inline
  def Anon_Headers(headers: SchemaLike = null): OutputValidation = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputValidation]
  }
}

