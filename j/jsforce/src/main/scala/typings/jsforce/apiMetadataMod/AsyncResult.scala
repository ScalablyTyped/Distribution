package typings.jsforce.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncResult extends js.Object {
  var done: Boolean
  var id: String
  var message: js.UndefOr[String] = js.undefined
  var state: String
  var statusCode: js.UndefOr[String] = js.undefined
}

object AsyncResult {
  @scala.inline
  def apply(done: Boolean, id: String, state: String, message: String = null, statusCode: String = null): AsyncResult = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncResult]
  }
}

