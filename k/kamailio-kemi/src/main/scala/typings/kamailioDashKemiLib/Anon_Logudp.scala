package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Logudp extends js.Object {
  def log_udp(txt: java.lang.String): scala.Double
}

object Anon_Logudp {
  @scala.inline
  def apply(log_udp: java.lang.String => scala.Double): Anon_Logudp = {
    val __obj = js.Dynamic.literal(log_udp = js.Any.fromFunction1(log_udp))
  
    __obj.asInstanceOf[Anon_Logudp]
  }
}

