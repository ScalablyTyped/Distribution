package typings.koaJoiRouter.anon

import typings.joi.mod.SchemaLike
import typings.koaJoiRouter.mod.OutputValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends OutputValidation {
  var headers: SchemaLike = js.native
}

object Headers {
  @scala.inline
  def apply(): Headers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeaders(value: SchemaLike): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersNull: Self = this.set("headers", null)
  }
  
}

