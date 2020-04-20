package typings.leadfoot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethod extends js.Object {
  var method: String
  var url: String
}

object AnonMethod {
  @scala.inline
  def apply(method: String, url: String): AnonMethod = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethod]
  }
}

