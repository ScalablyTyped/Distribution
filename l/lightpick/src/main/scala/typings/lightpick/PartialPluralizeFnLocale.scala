package typings.lightpick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lightpick.lightpick.Options.Locale.PluralizeFnLocale> */
trait PartialPluralizeFnLocale extends js.Object {
  var one: js.UndefOr[String] = js.undefined
  var other: js.UndefOr[String] = js.undefined
}

object PartialPluralizeFnLocale {
  @scala.inline
  def apply(one: String = null, other: String = null): PartialPluralizeFnLocale = {
    val __obj = js.Dynamic.literal()
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPluralizeFnLocale]
  }
}

