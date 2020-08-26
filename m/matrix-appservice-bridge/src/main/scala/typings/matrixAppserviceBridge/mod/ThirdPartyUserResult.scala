package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThirdPartyUserResult extends js.Object {
    // The name of the 3PE protocol
  var fields: js.Object = js.native
    // The Matrix user ID for the virtual representing this 3PU
  var protocol: String = js.native
  var userid: String = js.native
}

object ThirdPartyUserResult {
  @scala.inline
  def apply(fields: js.Object, protocol: String, userid: String): ThirdPartyUserResult = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartyUserResult]
  }
  @scala.inline
  implicit class ThirdPartyUserResultOps[Self <: ThirdPartyUserResult] (val x: Self) extends AnyVal {
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
    def setFields(value: js.Object): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserid(value: String): Self = this.set("userid", value.asInstanceOf[js.Any])
  }
  
}

