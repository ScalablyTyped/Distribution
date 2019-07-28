package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofxhttp extends js.Object {
  def xhttp_reply(code: Double, reason: String, ctype: String, body: String): Double
}

object Typeofxhttp {
  @scala.inline
  def apply(xhttp_reply: (Double, String, String, String) => Double): Typeofxhttp = {
    val __obj = js.Dynamic.literal(xhttp_reply = js.Any.fromFunction4(xhttp_reply))
  
    __obj.asInstanceOf[Typeofxhttp]
  }
}

