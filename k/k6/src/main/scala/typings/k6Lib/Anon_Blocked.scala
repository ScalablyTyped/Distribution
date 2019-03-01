package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blocked extends js.Object {
  var blocked: scala.Double
  var connecting: scala.Double
  var duration: scala.Double
  var looking_up: scala.Double
  var receiving: scala.Double
  var sending: scala.Double
  var tls_handshaking: scala.Double
  var waiting: scala.Double
}

object Anon_Blocked {
  @scala.inline
  def apply(
    blocked: scala.Double,
    connecting: scala.Double,
    duration: scala.Double,
    looking_up: scala.Double,
    receiving: scala.Double,
    sending: scala.Double,
    tls_handshaking: scala.Double,
    waiting: scala.Double
  ): Anon_Blocked = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blocked")(blocked)
    __obj.updateDynamic("connecting")(connecting)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("looking_up")(looking_up)
    __obj.updateDynamic("receiving")(receiving)
    __obj.updateDynamic("sending")(sending)
    __obj.updateDynamic("tls_handshaking")(tls_handshaking)
    __obj.updateDynamic("waiting")(waiting)
    __obj.asInstanceOf[Anon_Blocked]
  }
}

