package typings.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethod extends js.Object {
  var method: String
  var path: String
  var vhost: js.UndefOr[String] = js.undefined
}

object AnonMethod {
  @scala.inline
  def apply(method: String, path: String, vhost: String = null): AnonMethod = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (vhost != null) __obj.updateDynamic("vhost")(vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethod]
  }
}

