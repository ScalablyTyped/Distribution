package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.SwitchesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.Props because var conflicts: children. Inlined key, ref */ trait CommonEnhancedSwitchProps[T]
  extends reactLib.reactMod.InputHTMLAttributes[js.Object] {
  var key: js.UndefOr[reactLib.reactMod.Key] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var ref: js.UndefOr[reactLib.reactMod.LegacyRef[T]] = js.undefined
}

object CommonEnhancedSwitchProps {
  @scala.inline
  def apply[T](
    InputHTMLAttributes: reactLib.reactMod.InputHTMLAttributes[js.Object] = null,
    Props: reactLib.reactMod.Props[T] = null,
    label: reactLib.reactMod.ReactNode = null
  ): CommonEnhancedSwitchProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, Props)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonEnhancedSwitchProps[T]]
  }
}

