package typings.hapiCrumb.mod.hapiHapiAugmentingMod

import typings.hapiCrumb.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginSpecificConfiguration extends js.Object {
  var crumb: js.UndefOr[Boolean | AnonKey] = js.undefined
}

object PluginSpecificConfiguration {
  @scala.inline
  def apply(crumb: Boolean | AnonKey = null): PluginSpecificConfiguration = {
    val __obj = js.Dynamic.literal()
    if (crumb != null) __obj.updateDynamic("crumb")(crumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSpecificConfiguration]
  }
}

