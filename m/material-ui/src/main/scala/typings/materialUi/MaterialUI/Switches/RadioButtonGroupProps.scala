package typings.materialUi.MaterialUI.Switches

import typings.materialUi.materialUiStrings.left
import typings.materialUi.materialUiStrings.right
import typings.react.mod.CSSProperties
import typings.react.mod.FormEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioButtonGroupProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var defaultSelected: js.UndefOr[js.Any] = js.native
  var labelPosition: js.UndefOr[left | right] = js.native
  var name: String = js.native
  var onChange: js.UndefOr[js.Function2[/* e */ FormEvent[js.Object], /* selected */ String, Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var valueSelected: js.UndefOr[js.Any] = js.native
}

object RadioButtonGroupProps {
  @scala.inline
  def apply(name: String): RadioButtonGroupProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonGroupProps]
  }
  @scala.inline
  implicit class RadioButtonGroupPropsOps[Self <: RadioButtonGroupProps] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDefaultSelected(value: js.Any): Self = this.set("defaultSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSelected: Self = this.set("defaultSelected", js.undefined)
    @scala.inline
    def setLabelPosition(value: left | right): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    @scala.inline
    def setOnChange(value: (/* e */ FormEvent[js.Object], /* selected */ String) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setValueSelected(value: js.Any): Self = this.set("valueSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSelected: Self = this.set("valueSelected", js.undefined)
  }
  
}

