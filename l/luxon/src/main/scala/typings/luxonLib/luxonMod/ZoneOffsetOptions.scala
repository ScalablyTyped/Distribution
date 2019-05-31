package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOffsetOptions extends js.Object {
  var format: js.UndefOr[luxonLib.luxonLibStrings.short | luxonLib.luxonLibStrings.long] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
}

object ZoneOffsetOptions {
  @scala.inline
  def apply(
    format: luxonLib.luxonLibStrings.short | luxonLib.luxonLibStrings.long = null,
    locale: java.lang.String = null
  ): ZoneOffsetOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[ZoneOffsetOptions]
  }
}

