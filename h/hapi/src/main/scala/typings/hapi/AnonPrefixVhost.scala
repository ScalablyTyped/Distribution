package typings.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrefixVhost extends js.Object {
  /**
    * string added as prefix to any route path (must begin with '/'). If a plugin registers a child plugin the prefix is passed on to the child or is added in front of the child-specific prefix.
    */
  var prefix: String
  /**
    * virtual host string (or array of strings) applied to every route. The outer-most vhost overrides the any nested configuration.
    */
  var vhost: js.UndefOr[String | js.Array[String]] = js.undefined
}

object AnonPrefixVhost {
  @scala.inline
  def apply(prefix: String, vhost: String | js.Array[String] = null): AnonPrefixVhost = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    if (vhost != null) __obj.updateDynamic("vhost")(vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrefixVhost]
  }
}

