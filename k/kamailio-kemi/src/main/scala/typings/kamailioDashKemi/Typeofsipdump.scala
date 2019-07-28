package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsipdump extends js.Object {
  def send(stag: String): Double
}

object Typeofsipdump {
  @scala.inline
  def apply(send: String => Double): Typeofsipdump = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[Typeofsipdump]
  }
}

