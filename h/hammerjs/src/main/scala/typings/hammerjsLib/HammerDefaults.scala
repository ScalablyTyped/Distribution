package typings
package hammerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HammerDefaults extends HammerOptions {
  @JSName("cssProps")
  var cssProps_HammerDefaults: CssProps
  @JSName("domEvents")
  var domEvents_HammerDefaults: scala.Boolean
  @JSName("enable")
  var enable_HammerDefaults: scala.Boolean
  @JSName("inputClass")
  var inputClass_HammerDefaults: HammerInput
  @JSName("inputTarget")
  var inputTarget_HammerDefaults: stdLib.EventTarget
  @JSName("preset")
  var preset_HammerDefaults: js.Array[RecognizerTuple]
  @JSName("touchAction")
  var touchAction_HammerDefaults: java.lang.String
}

object HammerDefaults {
  @scala.inline
  def apply(
    cssProps: CssProps,
    domEvents: scala.Boolean,
    enable: scala.Boolean,
    inputClass: HammerInput,
    inputTarget: stdLib.EventTarget,
    preset: js.Array[RecognizerTuple],
    touchAction: java.lang.String,
    recognizers: js.Array[RecognizerTuple] = null
  ): HammerDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cssProps")(cssProps)
    __obj.updateDynamic("domEvents")(domEvents)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("inputClass")(inputClass)
    __obj.updateDynamic("inputTarget")(inputTarget)
    __obj.updateDynamic("preset")(preset)
    __obj.updateDynamic("touchAction")(touchAction)
    if (recognizers != null) __obj.updateDynamic("recognizers")(recognizers)
    __obj.asInstanceOf[HammerDefaults]
  }
}

