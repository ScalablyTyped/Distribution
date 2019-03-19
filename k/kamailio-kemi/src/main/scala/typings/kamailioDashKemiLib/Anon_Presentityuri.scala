package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Presentityuri extends js.Object {
  def xcap_auth_status(watcher_uri: java.lang.String, presentity_uri: java.lang.String): scala.Double
}

object Anon_Presentityuri {
  @scala.inline
  def apply(xcap_auth_status: (java.lang.String, java.lang.String) => scala.Double): Anon_Presentityuri = {
    val __obj = js.Dynamic.literal(xcap_auth_status = js.Any.fromFunction2(xcap_auth_status))
  
    __obj.asInstanceOf[Anon_Presentityuri]
  }
}

