package typings.i18n.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralOptions extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var plural: String
  var singular: String
}

object PluralOptions {
  @scala.inline
  def apply(plural: String, singular: String, count: Int | Double = null, locale: String = null): PluralOptions = {
    val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralOptions]
  }
}

