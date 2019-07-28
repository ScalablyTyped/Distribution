package typings.materialDashUi.underscoreUnderscoreMaterialUINs.SwitchesNs

import typings.react.reactMod.InputHTMLAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.reactMod.Props because var conflicts: children. Inlined key, ref */ trait CommonEnhancedSwitchProps[T]
  extends InputHTMLAttributes[js.Object] {
  var key: js.UndefOr[Key] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var ref: js.UndefOr[LegacyRef[T]] = js.undefined
}

object CommonEnhancedSwitchProps {
  @scala.inline
  def apply[T](
    InputHTMLAttributes: InputHTMLAttributes[js.Object] = null,
    Props: Props[T] = null,
    label: ReactNode = null
  ): CommonEnhancedSwitchProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, Props)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonEnhancedSwitchProps[T]]
  }
}

