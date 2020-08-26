package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddInfoNotAvailable extends js.Object {
  var addInfoNotAvailable: Double = js.native
  var badAlg: Double = js.native
  var badDataFormat: Double = js.native
  var badRequest: Double = js.native
  var systemFailure: Double = js.native
  var timeNotAvailable: Double = js.native
  var unacceptedExtension: Double = js.native
  var unacceptedPolicy: Double = js.native
}

object AddInfoNotAvailable {
  @scala.inline
  def apply(
    addInfoNotAvailable: Double,
    badAlg: Double,
    badDataFormat: Double,
    badRequest: Double,
    systemFailure: Double,
    timeNotAvailable: Double,
    unacceptedExtension: Double,
    unacceptedPolicy: Double
  ): AddInfoNotAvailable = {
    val __obj = js.Dynamic.literal(addInfoNotAvailable = addInfoNotAvailable.asInstanceOf[js.Any], badAlg = badAlg.asInstanceOf[js.Any], badDataFormat = badDataFormat.asInstanceOf[js.Any], badRequest = badRequest.asInstanceOf[js.Any], systemFailure = systemFailure.asInstanceOf[js.Any], timeNotAvailable = timeNotAvailable.asInstanceOf[js.Any], unacceptedExtension = unacceptedExtension.asInstanceOf[js.Any], unacceptedPolicy = unacceptedPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddInfoNotAvailable]
  }
  @scala.inline
  implicit class AddInfoNotAvailableOps[Self <: AddInfoNotAvailable] (val x: Self) extends AnyVal {
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
    def setAddInfoNotAvailable(value: Double): Self = this.set("addInfoNotAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setBadAlg(value: Double): Self = this.set("badAlg", value.asInstanceOf[js.Any])
    @scala.inline
    def setBadDataFormat(value: Double): Self = this.set("badDataFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setBadRequest(value: Double): Self = this.set("badRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemFailure(value: Double): Self = this.set("systemFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeNotAvailable(value: Double): Self = this.set("timeNotAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnacceptedExtension(value: Double): Self = this.set("unacceptedExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnacceptedPolicy(value: Double): Self = this.set("unacceptedPolicy", value.asInstanceOf[js.Any])
  }
  
}

