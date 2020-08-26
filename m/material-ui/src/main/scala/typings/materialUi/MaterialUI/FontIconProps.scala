package typings.materialUi.MaterialUI

import typings.react.mod.HTMLAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.Props because var conflicts: children. Inlined key, ref */ @js.native
trait FontIconProps
  extends HTMLAttributes[js.Object] {
  var hoverColor: js.UndefOr[String] = js.native
  var key: js.UndefOr[Key] = js.native
  var ref: js.UndefOr[LegacyRef[FontIcon]] = js.native
}

object FontIconProps {
  @scala.inline
  def apply(): FontIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontIconProps]
  }
  @scala.inline
  implicit class FontIconPropsOps[Self <: FontIconProps] (val x: Self) extends AnyVal {
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
    def setHoverColor(value: String): Self = this.set("hoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverColor: Self = this.set("hoverColor", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ FontIcon | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: LegacyRef[FontIcon]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

