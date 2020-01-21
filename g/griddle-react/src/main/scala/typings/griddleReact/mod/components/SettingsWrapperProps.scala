package typings.griddleReact.mod.components

import typings.griddleReact.mod.GriddleComponent
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsWrapperProps extends js.Object {
  var Settings: js.UndefOr[GriddleComponent[SettingsProps]] = js.undefined
  var SettingsToggle: js.UndefOr[GriddleComponent[SettingsToggleProps]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var isEnabled: js.UndefOr[Boolean] = js.undefined
  var isVisible: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SettingsWrapperProps {
  @scala.inline
  def apply(
    Settings: GriddleComponent[SettingsProps] = null,
    SettingsToggle: GriddleComponent[SettingsToggleProps] = null,
    className: String = null,
    isEnabled: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): SettingsWrapperProps = {
    val __obj = js.Dynamic.literal()
    if (Settings != null) __obj.updateDynamic("Settings")(Settings.asInstanceOf[js.Any])
    if (SettingsToggle != null) __obj.updateDynamic("SettingsToggle")(SettingsToggle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsWrapperProps]
  }
}

