package typings.griddleDashReact.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsComponentObject extends js.Object {
  var component: js.UndefOr[GriddleComponent[_]] = js.undefined
  var order: Double
}

object SettingsComponentObject {
  @scala.inline
  def apply(order: Double, component: GriddleComponent[_] = null): SettingsComponentObject = {
    val __obj = js.Dynamic.literal(order = order)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsComponentObject]
  }
}

