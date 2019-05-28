package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoflog_custom extends js.Object {
  def log_udp(txt: java.lang.String): scala.Double
}

object Typeoflog_custom {
  @scala.inline
  def apply(log_udp: java.lang.String => scala.Double): Typeoflog_custom = {
    val __obj = js.Dynamic.literal(log_udp = js.Any.fromFunction1(log_udp))
  
    __obj.asInstanceOf[Typeoflog_custom]
  }
}

