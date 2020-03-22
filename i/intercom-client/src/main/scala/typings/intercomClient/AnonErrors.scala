package typings.intercomClient

import typings.intercomClient.intercomClientStrings.errorDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrors extends js.Object {
  var errors: js.Array[AnonCode]
  var request_id: String
  var `type`: errorDotlist
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[AnonCode], request_id: String, `type`: errorDotlist): AnonErrors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrors]
  }
}

