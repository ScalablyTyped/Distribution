package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResponse extends js.Object {
  var parsed: js.Array[java.lang.String]
  var unparseable: js.Array[java.lang.String]
}

object ParseResponse {
  @scala.inline
  def apply(parsed: js.Array[java.lang.String], unparseable: js.Array[java.lang.String]): ParseResponse = {
    val __obj = js.Dynamic.literal(parsed = parsed, unparseable = unparseable)
  
    __obj.asInstanceOf[ParseResponse]
  }
}

