package typings
package leafletDashMouseDashPositionLib.leafletMod.ControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MousePositionControlOptions
  extends leafletLib.leafletMod.ControlOptions {
  var emptyString: js.UndefOr[java.lang.String] = js.undefined
  var latFormatter: js.UndefOr[js.Function1[/* lat */ scala.Double, java.lang.String]] = js.undefined
  var lngFirst: js.UndefOr[scala.Boolean] = js.undefined
  var lngFormatter: js.UndefOr[js.Function1[/* lng */ scala.Double, java.lang.String]] = js.undefined
  var numDigits: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

object MousePositionControlOptions {
  @scala.inline
  def apply(
    emptyString: java.lang.String = null,
    latFormatter: js.Function1[/* lat */ scala.Double, java.lang.String] = null,
    lngFirst: js.UndefOr[scala.Boolean] = js.undefined,
    lngFormatter: js.Function1[/* lng */ scala.Double, java.lang.String] = null,
    numDigits: scala.Int | scala.Double = null,
    position: leafletLib.leafletMod.ControlPosition = null,
    prefix: java.lang.String = null,
    separator: java.lang.String = null
  ): MousePositionControlOptions = {
    val __obj = js.Dynamic.literal()
    if (emptyString != null) __obj.updateDynamic("emptyString")(emptyString)
    if (latFormatter != null) __obj.updateDynamic("latFormatter")(latFormatter)
    if (!js.isUndefined(lngFirst)) __obj.updateDynamic("lngFirst")(lngFirst)
    if (lngFormatter != null) __obj.updateDynamic("lngFormatter")(lngFormatter)
    if (numDigits != null) __obj.updateDynamic("numDigits")(numDigits.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[MousePositionControlOptions]
  }
}

