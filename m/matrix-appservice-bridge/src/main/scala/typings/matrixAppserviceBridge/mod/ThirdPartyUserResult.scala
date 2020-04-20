package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThirdPartyUserResult extends js.Object {
    // The name of the 3PE protocol
  var fields: js.Object
    // The Matrix user ID for the virtual representing this 3PU
  var protocol: String
  var userid: String
}

object ThirdPartyUserResult {
  @scala.inline
  def apply(fields: js.Object, protocol: String, userid: String): ThirdPartyUserResult = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartyUserResult]
  }
}

