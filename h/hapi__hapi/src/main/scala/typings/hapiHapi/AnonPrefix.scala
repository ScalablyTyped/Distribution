package typings.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrefix extends js.Object {
  /**
    * the route path prefix used by any calls to server.route() from the server. Note that if a prefix is used and the route path is set to '/', the resulting path will not include
    * the trailing slash.
    */
  var prefix: String
  /** the route virtual host settings used by any calls to server.route() from the server. */
  var vhost: String
}

object AnonPrefix {
  @scala.inline
  def apply(prefix: String, vhost: String): AnonPrefix = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], vhost = vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrefix]
  }
}

