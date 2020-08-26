package typings.griddleReact.mod.components

import typings.griddleReact.mod.GriddleComponent
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsWrapperProps extends js.Object {
  var Settings: js.UndefOr[GriddleComponent[SettingsProps]] = js.native
  var SettingsToggle: js.UndefOr[GriddleComponent[SettingsToggleProps]] = js.native
  var className: js.UndefOr[String] = js.native
  var isEnabled: js.UndefOr[Boolean] = js.native
  var isVisible: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object SettingsWrapperProps {
  @scala.inline
  def apply(): SettingsWrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsWrapperProps]
  }
  @scala.inline
  implicit class SettingsWrapperPropsOps[Self <: SettingsWrapperProps] (val x: Self) extends AnyVal {
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
    def setSettings(value: GriddleComponent[SettingsProps]): Self = this.set("Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("Settings", js.undefined)
    @scala.inline
    def setSettingsToggle(value: GriddleComponent[SettingsToggleProps]): Self = this.set("SettingsToggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingsToggle: Self = this.set("SettingsToggle", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

