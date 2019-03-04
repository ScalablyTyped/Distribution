package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsComponentObject extends js.Object {
  var component: js.UndefOr[griddleDashReactLib.GriddleComponent[_]] = js.undefined
  var order: scala.Double
}

object SettingsComponentObject {
  @scala.inline
  def apply(order: scala.Double, component: griddleDashReactLib.GriddleComponent[_] = null): SettingsComponentObject = {
    val __obj = js.Dynamic.literal(order = order)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsComponentObject]
  }
}

