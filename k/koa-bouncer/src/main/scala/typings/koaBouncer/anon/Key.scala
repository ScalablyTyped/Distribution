package typings.koaBouncer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: String
  var message: String
}

object Key {
  @scala.inline
  def apply(key: String, message: String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

