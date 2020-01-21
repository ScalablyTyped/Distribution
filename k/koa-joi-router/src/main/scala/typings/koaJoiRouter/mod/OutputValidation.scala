package typings.koaJoiRouter.mod

import typings.joi.mod.SchemaLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.koaJoiRouter.AnonBody
  - typings.koaJoiRouter.AnonHeaders
*/
trait OutputValidation extends js.Object

object OutputValidation {
  @scala.inline
  def AnonBody(body: SchemaLike = null): OutputValidation = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputValidation]
  }
  @scala.inline
  def AnonHeaders(headers: SchemaLike = null): OutputValidation = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputValidation]
  }
}

