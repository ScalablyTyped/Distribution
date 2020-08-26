package typings.koaJoiRouter.anon

import typings.joi.mod.SchemaLike
import typings.koaJoiRouter.mod.OutputValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends OutputValidation {
  var body: SchemaLike = js.native
}

object Body {
  @scala.inline
  def apply(): Body = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Body]
  }
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
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
    def setBody(value: SchemaLike): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
  }
  
}

