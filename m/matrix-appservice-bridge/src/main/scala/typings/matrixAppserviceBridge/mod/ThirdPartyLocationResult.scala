package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThirdPartyLocationResult extends js.Object {
  var alias: String = js.native
    // The name of the 3PE protocol
  var fields: js.Object = js.native
    // The Matrix room alias to the portal room representing this 3PL
  var protocol: String = js.native
}

object ThirdPartyLocationResult {
  @scala.inline
  def apply(alias: String, fields: js.Object, protocol: String): ThirdPartyLocationResult = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartyLocationResult]
  }
  @scala.inline
  implicit class ThirdPartyLocationResultOps[Self <: ThirdPartyLocationResult] (val x: Self) extends AnyVal {
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setFields(value: js.Object): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
  }
  
}

