package typings
package luxonLib.luxonMod.luxonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToRelativeOptions extends js.Object {
  /** The DateTime to use as the basis to which this time is compared. Defaults to now. */
  var base: js.UndefOr[DateTime] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** The Intl system may choose not to honor this */
  var numberingSystem: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Padding in milliseconds. This allows you to round up the result if it fits inside the threshold.
    * Don't use in combination with {round: false} because the decimal output will include the padding.
    * Defaults to 0.
    */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /** Defaults to `true`. */
  var round: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[
    luxonLib.luxonLibStrings.long | luxonLib.luxonLibStrings.short | luxonLib.luxonLibStrings.narrow
  ] = js.undefined
  /** If omitted, the method will pick the unit. */
  var unit: js.UndefOr[
    luxonLib.luxonLibStrings.year | luxonLib.luxonLibStrings.quarter | luxonLib.luxonLibStrings.month | luxonLib.luxonLibStrings.week | luxonLib.luxonLibStrings.day | luxonLib.luxonLibStrings.hour | luxonLib.luxonLibStrings.minute | luxonLib.luxonLibStrings.second
  ] = js.undefined
}

