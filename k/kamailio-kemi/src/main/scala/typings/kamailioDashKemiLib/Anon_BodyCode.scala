package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCode extends js.Object {
  def xhttp_reply(code: scala.Double, reason: java.lang.String, ctype: java.lang.String, body: java.lang.String): scala.Double
}

object Anon_BodyCode {
  @scala.inline
  def apply(xhttp_reply: (scala.Double, java.lang.String, java.lang.String, java.lang.String) => scala.Double): Anon_BodyCode = {
    val __obj = js.Dynamic.literal(xhttp_reply = js.Any.fromFunction4(xhttp_reply))
  
    __obj.asInstanceOf[Anon_BodyCode]
  }
}

