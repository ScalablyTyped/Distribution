package typings.jsSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISanitizer extends js.Object {
  def sanitize(text: String): String
}

object ISanitizer {
  @scala.inline
  def apply(sanitize: String => String): ISanitizer = {
    val __obj = js.Dynamic.literal(sanitize = js.Any.fromFunction1(sanitize))
    __obj.asInstanceOf[ISanitizer]
  }
}

