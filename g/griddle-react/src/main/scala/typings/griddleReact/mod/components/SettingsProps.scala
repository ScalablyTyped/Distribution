package typings.griddleReact.mod.components

import typings.griddleReact.mod.GriddleComponent
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var settingsComponents: js.UndefOr[js.Array[GriddleComponent[_]]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SettingsProps {
  @scala.inline
  def apply(
    className: String = null,
    settingsComponents: js.Array[GriddleComponent[_]] = null,
    style: CSSProperties = null
  ): SettingsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (settingsComponents != null) __obj.updateDynamic("settingsComponents")(settingsComponents.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsProps]
  }
}

