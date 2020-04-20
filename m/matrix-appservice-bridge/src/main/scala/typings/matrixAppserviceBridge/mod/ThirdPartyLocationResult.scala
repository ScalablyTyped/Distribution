package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThirdPartyLocationResult extends js.Object {
  var alias: String
    // The name of the 3PE protocol
  var fields: js.Object
    // The Matrix room alias to the portal room representing this 3PL
  var protocol: String
}

object ThirdPartyLocationResult {
  @scala.inline
  def apply(alias: String, fields: js.Object, protocol: String): ThirdPartyLocationResult = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartyLocationResult]
  }
}

