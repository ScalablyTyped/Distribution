package typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallStreamOptions extends js.Object {
  var deadline: Deadline
  var flags: Double
  var host: String
  var parentCall: Call | Null
}

object CallStreamOptions {
  @scala.inline
  def apply(deadline: Deadline, flags: Double, host: String, parentCall: Call = null): CallStreamOptions = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
    if (parentCall != null) __obj.updateDynamic("parentCall")(parentCall.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallStreamOptions]
  }
}

