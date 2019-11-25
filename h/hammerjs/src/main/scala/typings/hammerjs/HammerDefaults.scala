package typings.hammerjs

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HammerDefaults extends HammerOptions {
  @JSName("cssProps")
  var cssProps_HammerDefaults: CssProps
  @JSName("domEvents")
  var domEvents_HammerDefaults: Boolean
  @JSName("enable")
  var enable_HammerDefaults: Boolean
  @JSName("inputClass")
  var inputClass_HammerDefaults: HammerInput
  @JSName("inputTarget")
  var inputTarget_HammerDefaults: EventTarget
  @JSName("preset")
  var preset_HammerDefaults: js.Array[RecognizerTuple]
  @JSName("touchAction")
  var touchAction_HammerDefaults: String
}

object HammerDefaults {
  @scala.inline
  def apply(
    cssProps: CssProps,
    domEvents: Boolean,
    enable: Boolean,
    inputClass: HammerInput,
    inputTarget: EventTarget,
    preset: js.Array[RecognizerTuple],
    touchAction: String,
    recognizers: js.Array[RecognizerTuple] = null
  ): HammerDefaults = {
    val __obj = js.Dynamic.literal(cssProps = cssProps.asInstanceOf[js.Any], domEvents = domEvents.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], inputClass = inputClass.asInstanceOf[js.Any], inputTarget = inputTarget.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any], touchAction = touchAction.asInstanceOf[js.Any])
    if (recognizers != null) __obj.updateDynamic("recognizers")(recognizers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HammerDefaults]
  }
}

