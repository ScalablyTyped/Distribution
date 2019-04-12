package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Prefix extends js.Object {
  /**
    * the route path prefix used by any calls to server.route() from the server. Note that if a prefix is used and the route path is set to '/', the resulting path will not include
    * the trailing slash.
    */
  var prefix: java.lang.String
  /** the route virtual host settings used by any calls to server.route() from the server. */
  var vhost: java.lang.String
}

object Anon_Prefix {
  @scala.inline
  def apply(prefix: java.lang.String, vhost: java.lang.String): Anon_Prefix = {
    val __obj = js.Dynamic.literal(prefix = prefix, vhost = vhost)
  
    __obj.asInstanceOf[Anon_Prefix]
  }
}

