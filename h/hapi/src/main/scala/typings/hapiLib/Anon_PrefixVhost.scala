package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrefixVhost extends js.Object {
  /**
    * string added as prefix to any route path (must begin with '/'). If a plugin registers a child plugin the prefix is passed on to the child or is added in front of the child-specific prefix.
    */
  var prefix: java.lang.String
  /**
    * virtual host string (or array of strings) applied to every route. The outer-most vhost overrides the any nested configuration.
    */
  var vhost: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Anon_PrefixVhost {
  @scala.inline
  def apply(prefix: java.lang.String, vhost: java.lang.String | js.Array[java.lang.String] = null): Anon_PrefixVhost = {
    val __obj = js.Dynamic.literal(prefix = prefix)
    if (vhost != null) __obj.updateDynamic("vhost")(vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PrefixVhost]
  }
}

