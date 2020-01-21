package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHost extends js.Object {
  var host: String
  var port: js.UndefOr[Double] = js.undefined
}

object AnonHost {
  @scala.inline
  def apply(host: String, port: Int | Double = null): AnonHost = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHost]
  }
}

