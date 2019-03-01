package typings
package hammerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HammerOptions extends js.Object {
  var cssProps: js.UndefOr[CssProps] = js.undefined
  var domEvents: js.UndefOr[scala.Boolean] = js.undefined
  var enable: js.UndefOr[scala.Boolean | (js.Function1[/* manager */ HammerManager, scala.Boolean])] = js.undefined
  var inputClass: js.UndefOr[HammerInput] = js.undefined
  var inputTarget: js.UndefOr[stdLib.EventTarget] = js.undefined
  var preset: js.UndefOr[js.Array[RecognizerTuple]] = js.undefined
  var recognizers: js.UndefOr[js.Array[RecognizerTuple]] = js.undefined
  var touchAction: js.UndefOr[java.lang.String] = js.undefined
}

object HammerOptions {
  @scala.inline
  def apply(
    cssProps: CssProps = null,
    domEvents: js.UndefOr[scala.Boolean] = js.undefined,
    enable: scala.Boolean | (js.Function1[/* manager */ HammerManager, scala.Boolean]) = null,
    inputClass: HammerInput = null,
    inputTarget: stdLib.EventTarget = null,
    preset: js.Array[RecognizerTuple] = null,
    recognizers: js.Array[RecognizerTuple] = null,
    touchAction: java.lang.String = null
  ): HammerOptions = {
    val __obj = js.Dynamic.literal()
    if (cssProps != null) __obj.updateDynamic("cssProps")(cssProps)
    if (!js.isUndefined(domEvents)) __obj.updateDynamic("domEvents")(domEvents)
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (inputClass != null) __obj.updateDynamic("inputClass")(inputClass)
    if (inputTarget != null) __obj.updateDynamic("inputTarget")(inputTarget)
    if (preset != null) __obj.updateDynamic("preset")(preset)
    if (recognizers != null) __obj.updateDynamic("recognizers")(recognizers)
    if (touchAction != null) __obj.updateDynamic("touchAction")(touchAction)
    __obj.asInstanceOf[HammerOptions]
  }
}

