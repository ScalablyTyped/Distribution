package typings.mailgunDashJs.mailgunDashJsMod.validation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResponse extends js.Object {
  var parsed: js.Array[String]
  var unparseable: js.Array[String]
}

object ParseResponse {
  @scala.inline
  def apply(parsed: js.Array[String], unparseable: js.Array[String]): ParseResponse = {
    val __obj = js.Dynamic.literal(parsed = parsed, unparseable = unparseable)
  
    __obj.asInstanceOf[ParseResponse]
  }
}

