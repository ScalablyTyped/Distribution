package typings.hapiAuthBearerToken.mod

import typings.hapiHapi.mod.AuthCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @hapi/hapi.@hapi/hapi.AuthenticationData & {  isValid :boolean} */
@js.native
trait ValidateReturn extends js.Object {
  var artifacts: js.UndefOr[js.Object] = js.native
  var credentials: AuthCredentials = js.native
  var isValid: Boolean = js.native
}

object ValidateReturn {
  @scala.inline
  def apply(credentials: AuthCredentials, isValid: Boolean): ValidateReturn = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateReturn]
  }
  @scala.inline
  implicit class ValidateReturnOps[Self <: ValidateReturn] (val x: Self) extends AnyVal {
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
    def setCredentials(value: AuthCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtifacts(value: js.Object): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifacts: Self = this.set("artifacts", js.undefined)
  }
  
}

