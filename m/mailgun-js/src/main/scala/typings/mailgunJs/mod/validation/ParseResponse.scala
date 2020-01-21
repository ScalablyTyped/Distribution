package typings.mailgunJs.mod.validation

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
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], unparseable = unparseable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseResponse]
  }
}

