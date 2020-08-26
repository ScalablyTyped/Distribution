package typings.hapiAuthBasic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateCustomResponse extends js.Object {
  var response: js.Any = js.native
}

object ValidateCustomResponse {
  @scala.inline
  def apply(response: js.Any): ValidateCustomResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateCustomResponse]
  }
  @scala.inline
  implicit class ValidateCustomResponseOps[Self <: ValidateCustomResponse] (val x: Self) extends AnyVal {
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
    def setResponse(value: js.Any): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

