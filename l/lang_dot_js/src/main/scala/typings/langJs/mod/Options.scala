package typings.langJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fallback: String
  var locale: String
  var messages: Messages
}

object Options {
  @scala.inline
  def apply(fallback: String, locale: String, messages: Messages): Options = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

