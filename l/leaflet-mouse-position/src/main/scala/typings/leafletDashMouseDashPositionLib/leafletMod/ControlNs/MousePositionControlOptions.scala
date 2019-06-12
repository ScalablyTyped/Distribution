package typings
package leafletDashMouseDashPositionLib.leafletMod.ControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MousePositionControlOptions
  extends leafletLib.leafletMod.ControlOptions {
  var emptyString: js.UndefOr[java.lang.String] = js.undefined
  var formatter: js.UndefOr[js.Function2[/* lng */ scala.Double, /* lat */ scala.Double, java.lang.String]] = js.undefined
  var latFormatter: js.UndefOr[js.Function1[/* lat */ scala.Double, java.lang.String]] = js.undefined
  var lngFirst: js.UndefOr[scala.Boolean] = js.undefined
  var lngFormatter: js.UndefOr[js.Function1[/* lng */ scala.Double, java.lang.String]] = js.undefined
  var numDigits: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var wrapLng: js.UndefOr[scala.Boolean] = js.undefined
}

object MousePositionControlOptions {
  @scala.inline
  def apply(
    emptyString: java.lang.String = null,
    formatter: (/* lng */ scala.Double, /* lat */ scala.Double) => java.lang.String = null,
    latFormatter: /* lat */ scala.Double => java.lang.String = null,
    lngFirst: js.UndefOr[scala.Boolean] = js.undefined,
    lngFormatter: /* lng */ scala.Double => java.lang.String = null,
    numDigits: scala.Int | scala.Double = null,
    position: leafletLib.leafletMod.ControlPosition = null,
    prefix: java.lang.String = null,
    separator: java.lang.String = null,
    wrapLng: js.UndefOr[scala.Boolean] = js.undefined
  ): MousePositionControlOptions = {
    val __obj = js.Dynamic.literal()
    if (emptyString != null) __obj.updateDynamic("emptyString")(emptyString)
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction2(formatter))
    if (latFormatter != null) __obj.updateDynamic("latFormatter")(js.Any.fromFunction1(latFormatter))
    if (!js.isUndefined(lngFirst)) __obj.updateDynamic("lngFirst")(lngFirst)
    if (lngFormatter != null) __obj.updateDynamic("lngFormatter")(js.Any.fromFunction1(lngFormatter))
    if (numDigits != null) __obj.updateDynamic("numDigits")(numDigits.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(wrapLng)) __obj.updateDynamic("wrapLng")(wrapLng)
    __obj.asInstanceOf[MousePositionControlOptions]
  }
}

