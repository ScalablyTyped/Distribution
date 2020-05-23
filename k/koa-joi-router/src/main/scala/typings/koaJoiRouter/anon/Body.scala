package typings.koaJoiRouter.anon

import typings.joi.mod.SchemaLike
import typings.koaJoiRouter.mod.OutputValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends OutputValidation {
  var body: SchemaLike
}

object Body {
  @scala.inline
  def apply(body: SchemaLike = null): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

