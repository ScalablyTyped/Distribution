package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofxhttp extends js.Object {
  def xhttp_reply(code: scala.Double, reason: java.lang.String, ctype: java.lang.String, body: java.lang.String): scala.Double
}

object Typeofxhttp {
  @scala.inline
  def apply(xhttp_reply: (scala.Double, java.lang.String, java.lang.String, java.lang.String) => scala.Double): Typeofxhttp = {
    val __obj = js.Dynamic.literal(xhttp_reply = js.Any.fromFunction4(xhttp_reply))
  
    __obj.asInstanceOf[Typeofxhttp]
  }
}

