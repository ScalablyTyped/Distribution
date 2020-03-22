package typings.locale.mod._Global_.Express

import typings.locale.mod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var locale: String
  var rawLocale: Locale
}

object Request {
  @scala.inline
  def apply(locale: String, rawLocale: Locale): Request = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], rawLocale = rawLocale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

