package typings.lightpick.mod.Options.Locale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralizeFnLocale extends js.Object {
  var one: String
  var other: String
}

object PluralizeFnLocale {
  @scala.inline
  def apply(one: String, other: String): PluralizeFnLocale = {
    val __obj = js.Dynamic.literal(one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluralizeFnLocale]
  }
}

