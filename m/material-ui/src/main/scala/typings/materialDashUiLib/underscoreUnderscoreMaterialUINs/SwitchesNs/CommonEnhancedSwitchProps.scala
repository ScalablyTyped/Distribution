package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.SwitchesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.ReactNs.Props because var conflicts: children. Inlined key, ref */ trait CommonEnhancedSwitchProps[T]
  extends reactLib.reactMod.ReactNs.InputHTMLAttributes[js.Object] {
  var key: js.UndefOr[reactLib.reactMod.ReactNs.Key] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var ref: js.UndefOr[reactLib.reactMod.ReactNs.LegacyRef[T]] = js.undefined
}

object CommonEnhancedSwitchProps {
  @scala.inline
  def apply[T](
    InputHTMLAttributes: reactLib.reactMod.ReactNs.InputHTMLAttributes[js.Object] = null,
    Props: reactLib.reactMod.ReactNs.Props[T] = null,
    label: reactLib.reactMod.ReactNs.ReactNode = null
  ): CommonEnhancedSwitchProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, Props)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonEnhancedSwitchProps[T]]
  }
}

