package typings.materialUi.MaterialUI.Toolbar

import typings.materialUi.materialUiStrings.left
import typings.materialUi.materialUiStrings.right
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarGroupProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var firstChild: js.UndefOr[Boolean] = js.native
  var float: js.UndefOr[left | right] = js.native
  var lastChild: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object ToolbarGroupProps {
  @scala.inline
  def apply(): ToolbarGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarGroupProps]
  }
  @scala.inline
  implicit class ToolbarGroupPropsOps[Self <: ToolbarGroupProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setFirstChild(value: Boolean): Self = this.set("firstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstChild: Self = this.set("firstChild", js.undefined)
    @scala.inline
    def setFloat(value: left | right): Self = this.set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    @scala.inline
    def setLastChild(value: Boolean): Self = this.set("lastChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastChild: Self = this.set("lastChild", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

