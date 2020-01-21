package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoflogCustom extends js.Object {
  def log_udp(txt: String): Double
}

object TypeoflogCustom {
  @scala.inline
  def apply(log_udp: String => Double): TypeoflogCustom = {
    val __obj = js.Dynamic.literal(log_udp = js.Any.fromFunction1(log_udp))
  
    __obj.asInstanceOf[TypeoflogCustom]
  }
}

