package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoflog_custom extends js.Object {
  def log_udp(txt: String): Double
}

object Typeoflog_custom {
  @scala.inline
  def apply(log_udp: String => Double): Typeoflog_custom = {
    val __obj = js.Dynamic.literal(log_udp = js.Any.fromFunction1(log_udp))
  
    __obj.asInstanceOf[Typeoflog_custom]
  }
}

