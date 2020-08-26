package typings.hapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validate extends js.Object {
  var validate: js.Object = js.native
}

object Validate {
  @scala.inline
  def apply(validate: js.Object): Validate = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validate]
  }
  @scala.inline
  implicit class ValidateOps[Self <: Validate] (val x: Self) extends AnyVal {
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
    def setValidate(value: js.Object): Self = this.set("validate", value.asInstanceOf[js.Any])
  }
  
}

