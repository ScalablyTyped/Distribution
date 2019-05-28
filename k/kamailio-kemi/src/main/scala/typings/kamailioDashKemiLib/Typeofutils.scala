package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofutils extends js.Object {
  def xcap_auth_status(watcher_uri: java.lang.String, presentity_uri: java.lang.String): scala.Double
}

object Typeofutils {
  @scala.inline
  def apply(xcap_auth_status: (java.lang.String, java.lang.String) => scala.Double): Typeofutils = {
    val __obj = js.Dynamic.literal(xcap_auth_status = js.Any.fromFunction2(xcap_auth_status))
  
    __obj.asInstanceOf[Typeofutils]
  }
}

