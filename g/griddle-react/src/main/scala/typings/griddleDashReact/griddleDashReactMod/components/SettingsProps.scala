package typings.griddleDashReact.griddleDashReactMod.components

import typings.griddleDashReact.griddleDashReactMod.GriddleComponent
import typings.react.reactMod.CSSProperties
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
    if (className != null) __obj.updateDynamic("className")(className)
    if (settingsComponents != null) __obj.updateDynamic("settingsComponents")(settingsComponents)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SettingsProps]
  }
}

