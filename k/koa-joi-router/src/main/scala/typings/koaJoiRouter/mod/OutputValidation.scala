package typings.koaJoiRouter.mod

import typings.joi.mod.SchemaLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.koaJoiRouter.anon.Body
  - typings.koaJoiRouter.anon.Headers
*/
trait OutputValidation extends js.Object

object OutputValidation {
  @scala.inline
  def Body(body: SchemaLike = null): OutputValidation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputValidation]
  }
  @scala.inline
  def Headers(headers: SchemaLike = null): OutputValidation = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputValidation]
  }
}

