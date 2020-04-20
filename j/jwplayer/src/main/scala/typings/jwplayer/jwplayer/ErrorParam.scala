package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorParam extends js.Object {
  var message: String
}

object ErrorParam {
  @scala.inline
  def apply(message: String): ErrorParam = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorParam]
  }
}

