package typings.jsonapiSerializer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONAPIError extends js.Object {
  var errors: js.Array[_] = js.native
}

object JSONAPIError {
  @scala.inline
  def apply(errors: js.Array[_]): JSONAPIError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONAPIError]
  }
  @scala.inline
  implicit class JSONAPIErrorOps[Self <: JSONAPIError] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: js.Any*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[_]): Self = this.set("errors", value.asInstanceOf[js.Any])
  }
  
}

