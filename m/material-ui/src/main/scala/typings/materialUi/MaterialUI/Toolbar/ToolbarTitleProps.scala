package typings.materialUi.MaterialUI.Toolbar

import typings.react.mod.HTMLAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.Props because var conflicts: children. Inlined key, ref */ @js.native
trait ToolbarTitleProps
  extends HTMLAttributes[js.Object] {
  var key: js.UndefOr[Key] = js.native
  var ref: js.UndefOr[LegacyRef[ToolbarTitle]] = js.native
  var text: js.UndefOr[String] = js.native
}

object ToolbarTitleProps {
  @scala.inline
  def apply(): ToolbarTitleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarTitleProps]
  }
  @scala.inline
  implicit class ToolbarTitlePropsOps[Self <: ToolbarTitleProps] (val x: Self) extends AnyVal {
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
    def setRefFunction1(value: /* instance */ ToolbarTitle | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: LegacyRef[ToolbarTitle]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

