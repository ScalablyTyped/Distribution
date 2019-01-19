package typings
package luxonLib.luxonMod.luxonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToRelativeCalendarOptions extends js.Object {
  /** The DateTime to use as the basis to which this time is compared. Defaults to now. */
  var base: js.UndefOr[DateTime] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** The Intl system may choose not to honor this. */
  var numberingSystem: js.UndefOr[java.lang.String] = js.undefined
  /** If omitted, the method will pick the unit. */
  var unit: js.UndefOr[
    luxonLib.luxonLibStrings.year | luxonLib.luxonLibStrings.quarter | luxonLib.luxonLibStrings.month | luxonLib.luxonLibStrings.week | luxonLib.luxonLibStrings.day | luxonLib.luxonLibStrings.hour | luxonLib.luxonLibStrings.minute | luxonLib.luxonLibStrings.second
  ] = js.undefined
}

