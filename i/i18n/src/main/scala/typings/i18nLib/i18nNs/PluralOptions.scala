package typings
package i18nLib.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralOptions extends js.Object {
  var count: js.UndefOr[scala.Double] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var plural: java.lang.String
  var singular: java.lang.String
}

object PluralOptions {
  @scala.inline
  def apply(
    plural: java.lang.String,
    singular: java.lang.String,
    count: scala.Int | scala.Double = null,
    locale: java.lang.String = null
  ): PluralOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("plural")(plural)
    __obj.updateDynamic("singular")(singular)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[PluralOptions]
  }
}

