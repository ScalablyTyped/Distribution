package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOffsetOptions extends js.Object {
  var format: js.UndefOr[luxonLib.luxonLibStrings.short | luxonLib.luxonLibStrings.long] = js.undefined
  var localeCode: js.UndefOr[java.lang.String] = js.undefined
}

object ZoneOffsetOptions {
  @scala.inline
  def apply(
    format: luxonLib.luxonLibStrings.short | luxonLib.luxonLibStrings.long = null,
    localeCode: java.lang.String = null
  ): ZoneOffsetOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (localeCode != null) __obj.updateDynamic("localeCode")(localeCode)
    __obj.asInstanceOf[ZoneOffsetOptions]
  }
}

