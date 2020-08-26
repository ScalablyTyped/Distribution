package typings.hapiAuthJwt2.mod

import typings.hapiHapi.mod.ResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationResult extends js.Object {
  var credentials: js.UndefOr[js.Any] = js.native
  var errorMessage: js.UndefOr[String] = js.native
  var isValid: Boolean = js.native
  var response: js.UndefOr[ResponseObject] = js.native
}

object ValidationResult {
  @scala.inline
  def apply(isValid: Boolean): ValidationResult = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResult]
  }
  @scala.inline
  implicit class ValidationResultOps[Self <: ValidationResult] (val x: Self) extends AnyVal {
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
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentials(value: js.Any): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setResponse(value: ResponseObject): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
  
}

