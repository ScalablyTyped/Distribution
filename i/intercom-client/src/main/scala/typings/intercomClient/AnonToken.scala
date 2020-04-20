package typings.intercomClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToken extends js.Object {
  var token: String
}

object AnonToken {
  @scala.inline
  def apply(token: String): AnonToken = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonToken]
  }
}

