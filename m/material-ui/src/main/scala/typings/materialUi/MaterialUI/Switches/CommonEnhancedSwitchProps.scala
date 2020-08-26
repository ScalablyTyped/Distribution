package typings.materialUi.MaterialUI.Switches

import typings.react.mod.InputHTMLAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.Props because var conflicts: children. Inlined key, ref */ @js.native
trait CommonEnhancedSwitchProps[T]
  extends InputHTMLAttributes[js.Object] {
  var key: js.UndefOr[Key] = js.native
  var label: js.UndefOr[ReactNode] = js.native
  var ref: js.UndefOr[LegacyRef[T]] = js.native
}

object CommonEnhancedSwitchProps {
  @scala.inline
  def apply[T](): CommonEnhancedSwitchProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonEnhancedSwitchProps[T]]
  }
  @scala.inline
  implicit class CommonEnhancedSwitchPropsOps[Self <: CommonEnhancedSwitchProps[_], T] (val x: Self with CommonEnhancedSwitchProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ T | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: LegacyRef[T]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

