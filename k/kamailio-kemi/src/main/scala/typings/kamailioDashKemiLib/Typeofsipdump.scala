package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsipdump extends js.Object {
  def send(stag: java.lang.String): scala.Double
}

object Typeofsipdump {
  @scala.inline
  def apply(send: java.lang.String => scala.Double): Typeofsipdump = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[Typeofsipdump]
  }
}

