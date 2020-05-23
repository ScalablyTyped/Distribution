package typings.koaJoiRouter.anon

import typings.joi.mod.SchemaLike
import typings.koaJoiRouter.mod.OutputValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends OutputValidation {
  var headers: SchemaLike
}

object Headers {
  @scala.inline
  def apply(headers: SchemaLike = null): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

