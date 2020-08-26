package typings.ibmOpenapiValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait validatorResult extends js.Object {
  var errors: js.Array[js.Any | validatorResultItem] = js.native
  var warnings: js.Array[js.Any | validatorResultItem] = js.native
}

object validatorResult {
  @scala.inline
  def apply(errors: js.Array[js.Any | validatorResultItem], warnings: js.Array[js.Any | validatorResultItem]): validatorResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[validatorResult]
  }
  @scala.inline
  implicit class validatorResultOps[Self <: validatorResult] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: (js.Any | validatorResultItem)*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[js.Any | validatorResultItem]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningsVarargs(value: (js.Any | validatorResultItem)*): Self = this.set("warnings", js.Array(value :_*))
    @scala.inline
    def setWarnings(value: js.Array[js.Any | validatorResultItem]): Self = this.set("warnings", value.asInstanceOf[js.Any])
  }
  
}

